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
                    perimeter += calculatePerimeterForTile(grid, i, j, C);
                }
            }
        }

        return perimeter;
    }

    private static int calculatePerimeterForTile(int[][] grid, int row, int col, int C) {
        int perimeter = 0;

        // Check all three sides of the triangle
        // Side 1
        if (isBoundaryOrDry(grid, row, col - 1, col == 0)) perimeter++;
        // Side 2
        if (isBoundaryOrDry(grid, row, col + 1, col == C - 1)) perimeter++;
        // Side 3
        if (isBoundaryOrDry(grid, 1 - row, (row == 0) ? col : col + 1, (row == 0) ? col == C - 1 : col == 0)) perimeter++;

        return perimeter;
    }

    private static boolean isBoundaryOrDry(int[][] grid, int row, int col, boolean isBoundary) {
        // If it's a boundary or the adjacent tile is dry
        return isBoundary || grid[row][col] == 0;
    }
}

