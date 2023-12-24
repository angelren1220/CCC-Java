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

public class CCC_23_S1{
  public static void main(String[] args) {

    // 1. read the input
    Scanner sc = new Scanner(System.in);
    int C = sc.nextInt();
    int [][] grid = new int[2][C];

    // 2. process the grid
    for (int i = 0; i < 2; i++){
      for (int j = 0; j < C; j++){
        grid[i][j] = sc.nextInt();
      }
    }
    sc.close();

    // 3. calculate perimeter
    int totalPerimeter = 0;
    for (int i = 0; i < 2; i++){
      for (int j = 0; j < C; j++){
        if(grid[i][j] == 1) { // tile is wet
          totalPerimeter += calculatePerimeterForTile(grid, i, j, C);
        }
      }
    }

    System.out.println(totalPerimeter);

  }

  private static int calculatePerimeterForTile(int[][] grid, int row, int col, int C){
    int perimeter = 0;

    return perimeter;
  }
}