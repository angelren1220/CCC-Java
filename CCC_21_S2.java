/*
 * 2021 Senior Problem 2
 * Morden Art
 */

import java.util.Scanner;

public class CCC_21_S2 {

  public static void main(String[] args) {
    // 1. read the input
    Scanner scanner = new Scanner(System.in);
    int M = scanner.nextInt(); // Number of rows
    int N = scanner.nextInt(); // Number of columns
    int K = scanner.nextInt(); // Number of operations

    boolean[] rows = new boolean[M]; // false for black, true for gold
    boolean[] cols = new boolean[N]; // false for black, true for gold
    // Read the operations and apply them to the canvas
    for (int i = 0; i < K; i++) {
      String operation = scanner.next();
      int index = scanner.nextInt() - 1; // Convert to zero-based index

      if (operation.equals("R")) {
        rows[index] = !rows[index]; // Flip the color of the row
      } else if (operation.equals("C")) {
        cols[index] = !cols[index]; // Flip the color of the column
      }
    }
    scanner.close();
    // 2. count the number of gold cells
    int goldCount = countGoldCells(rows, cols);
    System.out.println(goldCount);
    // 3. output the result
    System.out.println(goldCount);
  }

  public static int countGoldCells(boolean[] rows, boolean[] cols){
    int goldCount = 0;
    return goldCount;
  }
}
