/*
 * 2021 Senior Problem 1 Crazy Fencing
 */

import java.util.Scanner;

public class CCC_21_S1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 1. read input
    int N = sc.nextInt();

    double totalArea = 0;
    int[] heights = new int[N + 1];
    int[] widths = new int[N];

    for (int i = 0; i <= N; i++) {
      heights[i] = sc.nextInt();
    }

    for (int i = 0; i < N; i++) {
      widths[i] = sc.nextInt();
    }

    sc.close();

    // 2. calculate and sum the area
    for (int i = 0; i < N; i++) {
      totalArea += ((heights[i] + heights[i + 1]) / 2.0) * widths[i];
    }

    // 3. output the result
    System.out.println(totalArea);
  }

}
