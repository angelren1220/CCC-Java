/*
 * 2020 CCC Senior Problem 1
 * Surmising a Sprinter’s Speed
 */

// 1. Read the input number of observations.
// 2. For each observation, read the time and the position of the sprinter.
// 3. Calculate the speed between each pair of observations.
// 4. Find the maximum speed.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CCC_20_S1 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the number of observations
        
        ArrayList<Double> speeds = new ArrayList<>();
        
        int[] times = new int[n];
        int[] positions = new int[n];
        
        for (int i = 0; i < n; i++) {
            times[i] = scanner.nextInt();
            positions[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Calculate the speed as distance over time
                double speed = Math.abs((positions[j] - positions[i]) / (double)(times[j] - times[i]));
                speeds.add(speed);
            }
        }
        
        // Find the maximum speed
        double maxSpeed = Collections.max(speeds);
        
        // Output the maximum speed
        System.out.println(maxSpeed);
        
        scanner.close();
    }
}
