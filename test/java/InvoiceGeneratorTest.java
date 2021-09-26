
import model.Ride;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.InvoiceGenerator;
import service.InvoiceSummary;


public class InvoiceGeneratorTest {
    service.InvoiceGenerator InvoiceGenerator = null;

    @Before
    public void setup() {
        InvoiceGenerator = new InvoiceGenerator();
    }

    @Test
    public void givenDistanceAndTime_shouldReturnFare() {
        double distance = 2.0;
        int time = 5;
        double result = InvoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25, result, 0.0);
    }

    @Test
    public void givenLessDistanceAndTime_shouldReturnMinimumFare() {
        double distance = 0.1;
        int time = 1;
        double result = InvoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5, result, 0.0);
    }

    @Test
    public void givenMultipleRides_shouldReturnInvoiceSummary() {
        Ride[] rides = { new Ride(2.0, 5), new Ride(0.1, 1) };
        InvoiceSummary summary = InvoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30);
        Assert.assertEquals(expectedInvoiceSummary, summary);
    }

}
