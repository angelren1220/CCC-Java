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

    // 3. Determine the range of possible positions for c that would allow each friend to hear the concert.
    // 4. For each possible position c, calculate the total time it would take all friends to reach a point within their hearing range.
    // 5. Choose the position c that minimizes the total time.
  }

  public static long minimumWalkingTime(int N, long[] P, long[] W, long[] D){
    return 0;
  }

}
