/*
 * 2021 Senior Problem 3
 */

import java.util.Scanner;

public class CCC_21_S3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 1. Read the number of friends N.
    int N = sc.nextInt();
    long[] P = new long[N];
    long[] W = new long[N];
    long[] D = new long[N];

    // 2. For each friend, read their initial position P_i, walking speed W_i, and hearing range D_i.
    for (int i = 0; i < N; i++) {
        P[i] = sc.nextLong();
        W[i] = sc.nextLong();
        D[i] = sc.nextLong();
    }

    System.out.println(minimumWalkingTime(N, P, W, D));
    sc.close();

  }

  public static long minimumWalkingTime(int N, long[] P, long[] W, long[] D){
    long left = 0; // Start of the search range
    long right = (long)1e9; // End of the search range, assuming positions can be very large

    // binary search to find the optimal concert position
    while (left < right) {
        long c = (left + right) / 2; // Midpoint of the current search range
        // Compare total walking time at position 'c' and 'c+1' to decide which direction to search
        if (helper(N, P, W, D, c) < helper(N, P, W, D, c + 1)) {
            right = c;  // If 'c' is better, search the left half
        } else {
            left = c + 1; // If 'c+1' is better, search the right half
        }
    }
    // After the loop, 'left' is the optimal concert position
    return helper(N, P, W, D, left);

  }

  // Helper method to calculate the total walking time given a concert position 'c'
  private static long helper(int N, long[] P, long[] W, long[] D, long c) {
    // Initialize total walking time
    long totalWalkingTime = 0;

    // Iterate through each friend
    for (int i = 0; i < N; i++) {
        if (Math.abs(P[i] - c) > D[i]) {
            totalWalkingTime += (Math.abs(P[i] - c) - D[i]) * W[i];
        }
    }
    return totalWalkingTime;
}

}
