package service;

import model.Ride;

import java.util.HashMap;
import java.util.Map;

public class RideRepo {
    public Map<String, Ride[]> ridesMap;

    public void addRides(String userId, Ride[] rides) {
        ridesMap = new HashMap<>();
        ridesMap.put(userId, rides);
    }

    public Ride[] getRides(String userId) {
        return ridesMap.get(userId);
    }
}
