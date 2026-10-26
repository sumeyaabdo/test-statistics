package com.pluralsight;

public class TestStatsApp {
    public static void main(String[] args) {
        //Create an array with 10 test score

        int[] testScores = {85, 90, 78, 82, 88, 76, 90, 89, 74, 91};

        int sum = 0;

        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }

        double average = (double) sum / testScores.length;
        System.out.println("Average score: " + average);

        // figure out the highest test score
        int highScore = testScores[0];

        for (int i = 0; i < testScores.length; i++) {
            if (testScores[i] > highScore) {
                highScore = testScores[i];
            }
        }

        System.out.println("High Score: " + highScore);

        // figure out the lowest test score
        int lowScore = testScores[0];

        for (int i = 0; i < testScores.length; i++) {
            if (testScores[i] < lowScore) {
                lowScore = testScores[i];
            }
        }
        Arrays.sort(testScores);

        double median = (testScores[4] + testScores[5]) / 2.0;

        System.out.println("Median Score: " + median);

        System.out.println("Low Score: " + lowScore);




    }
}
