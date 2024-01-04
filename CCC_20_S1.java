/*
 * 2020 CCC Senior Problem 1
 * Surmising a Sprinter’s Speed
 */

// 1. Read the input number of observations.
// 2. For each observation, read the time and the position of the sprinter.
// 3. Calculate the speed between each pair of observations.
// 4. Find the maximum speed.

import java.util.Arrays;
import java.util.Scanner;

public class CCC_20_S1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the number of observations

        int[][] observations = new int[n][2]; // 2D array for times and positions

        for (int i = 0; i < n; i++) {
            observations[i][0] = scanner.nextInt(); // time
            observations[i][1] = scanner.nextInt(); // position
        }

        // Sort the 2D array based on the first column (time)
        Arrays.sort(observations, (a, b) -> Integer.compare(a[0], b[0]));

        double maxSpeed = 0;
        for (int i = 1; i < n; i++) {
            double speed = Math.abs((double) (observations[i][1] - observations[i - 1][1]) / 
                                    (observations[i][0] - observations[i - 1][0]));
            maxSpeed = Math.max(maxSpeed, speed);
        }

        System.out.printf("%.1f%n", maxSpeed);
        
        scanner.close();
    }
}
