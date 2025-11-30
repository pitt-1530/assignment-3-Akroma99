package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class PlaylistRecommenderTest {

    @Test
    public void method1() {
        List<Integer> testing = List.of(500, 40, 130);

        assertEquals(PlaylistRecommender.classifyEnergy(testing), "HIGH", "values add up to 670 and the average would be 223.33 which is HIGH ");
    }

    @Test
    public void method2() {
        assertFalse(PlaylistRecommender.isValidTrackTitle("$$$$$MoneyMoneyMoney"), "Should be false because of special characters");
    }

    @Test
    public void method3() {
        assertEquals(PlaylistRecommender.normalizeVolume(190), 100, "Should be print out 100 if the value is over 100");
    }
}
