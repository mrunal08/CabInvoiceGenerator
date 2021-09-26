import model.Ride;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.RideRepo;

public class RideRepoTest {
    RideRepo rideRepository;
    @Before
    public void setUp() {
        rideRepository = new RideRepo();
    }

    @Test
    public void givenUserId_shouldReturnListOfRides() {
        Ride[] userRides = { new Ride(2.0, 5), new Ride(0.1, 1) };
        String userId = "Mrunal08";
        rideRepository.addRides(userId, userRides);
        Ride[] ridesList = rideRepository.getRides(userId);
        Assert.assertEquals(userRides[0], ridesList[0]);
        Assert.assertEquals(userRides[1], ridesList[1]);
    }
}
