package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LandmarkTest {
    @Test
    void shouldCreateLandmarkWithName() {
        String expectedName = "PUNE";
        Landmark landmark = new Landmark(expectedName);
        Assertions.assertEquals(expectedName, landmark.getName());
    }
}
