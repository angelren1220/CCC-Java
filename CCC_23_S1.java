/*
 * Bocchi the Builder has just finished constructing her latest project: a
 * pathway consisting of two rows of white equilateral triangular tiles.
 * However, at the last moment, disaster struck, and she accidentally spilled
 * black paint on some of the tiles! Now, she must purchase warning tape to
 * block off the wet areas. Can you help her determine how many meters of tape
 * she needs?
 * 
 * The first triangle will always point upwards, and any pair of adjacent tiles
 * (that is, tiles that share a common side) will point in opposite directions.
 * Every triangle has a side length of 1 meter.
 */

/*
 * Input Specification
 * The first line will consist of one integer,
 * , representing the number of columns.
 * 
 * The next two lines will each consist of
 * integers separated by spaces. Each integer represents the colour of a tile in
 * the room, with 1 indicating that the tile is black and 0 indicating that the
 * tile is white.
 * 
 * The following table shows how the available 15 marks are distributed:
 */

/*
 * Output Specification
 * Output a single integer representing the length of the tape Bocchi must
 * purchase in meters.
 */

import java.util.Scanner;

public class CCC_23_S1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int C = sc.nextInt(); // Number of columns
    int[][] grid = new int[2][C]; // Grid for the tiles

    // Reading the grid input
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < C; j++) {
        grid[i][j] = sc.nextInt();
      }
    }

    sc.close();

    System.out.println(calculateTotalPerimeter(grid, C));
  }

  private static int calculateTotalPerimeter(int[][] grid, int C) {
    int perimeter = 0;

    // Process each tile
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < C; j++) {
        if (grid[i][j] == 1) { // If the tile is wet
          // Add 3 for each wet tile initially
          perimeter += 3;

          // Subtract for shared edges in the same row
          if (j > 0 && grid[i][j - 1] == 1) {
            perimeter--; // Shared edge with the left tile
            // System.out.println("row" + i + "col" + j + "minus left" + perimeter);
          }
          if (j < C - 1 && grid[i][j + 1] == 1) {
            perimeter--; // Shared edge with the right tile
            // System.out.println("row" + i + "col" + j + "minus right" + perimeter);
          }

          // Subtract for shared edges between rows
          if (j % 2 == 0 && i == 0 && grid[i + 1][j] == 1) {
            perimeter--;
            // System.out.println("row" + i + "col" + j + "minus bot" + perimeter);
          }
          if (j % 2 == 0 && i == 1 && grid[i - 1][j] == 1) {
            perimeter--;
            // System.out.println("row" + i + "col" + j + "minus top" + perimeter);
          }
          // System.out.println(perimeter);
        }
      }
    }

    return perimeter;
  }

}