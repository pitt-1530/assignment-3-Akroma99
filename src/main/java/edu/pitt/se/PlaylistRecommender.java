package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {

        if (bpms == null || bpms.isEmpty()) {
            throw new IllegalArgumentException("BPM list cannot be null or empty");
        }

        // gets the average bpm
        int totalBPM = 0;
        for (int bpm : bpms) {
            totalBPM += bpm;
        }
        double avgBPM = (double) totalBPM / bpms.size();

        if (avgBPM >= 140) {
            return "HIGH";
        } else if (avgBPM >= 100) {
            return "MEDIUM";
        } else {
            return "LOW";
        }

    }

    public static boolean isValidTrackTitle(String title) {
        if (title == null || title.length() < 1 || title.length() > 30) {
            return false;
        }

        // check every individual character to see if it's valid
        for (int i = 0; i < title.length(); i++) {
            char c = title.charAt(i);
            if (!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }

        return true;
    }

    public static int normalizeVolume(int volumeDb) {
        if (volumeDb >= 100) {
            return 100;
        } else if (volumeDb <= 0) {
            return 0;
        } else {
            return volumeDb;
        }
    }
}
