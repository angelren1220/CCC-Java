/*
 * Problem Description
A class has been divided into groups of three. This division into groups might violate two types of constraints: some students must work together in the same group, and some students must work in separate groups.
Your job is to determine how many of the constraints are violated.
Input Specification
The first line will contain an integer X with X ≥ 0. The next X lines will each consist of two different names, separated by a single space. These two students must be in the same group.
The next line will contain an integer Y with Y ≥ 0. The next Y lines will each consist of two different names, separated by a single space. These two students must not be in the same group.
Among these X + Y lines representing constraints, each possible pair of students appears at most once.
The next line will contain an integer G with G ≥ 1. The last G lines will each consist of three different names, separated by single spaces. These three students have been placed in the same group.
Each name will consist of between 1 and 10 uppercase letters. No two students will have the same name and each name appearing in a constraint will appear in exactly one of the G groups.

 */

/*
 * Output Specification
 * Output an integer between 0 and X+Y which is the number of constraints that are violated.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CCC_22_S2 {

    private static String getSortedKey(String name1, String name2) {
        char[] chars = (name1 + name2).toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> same = new HashMap<>();

        for (int i = 0; i < X; i++) {
            String[] students = scanner.nextLine().split(" ");
            String key = getSortedKey(students[0], students[1]);
            same.put(key, 1);
        }

        int Y = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> notSame = new HashMap<>();

        for (int i = 0; i < Y; i++) {
            String[] students = scanner.nextLine().split(" ");
            String key = getSortedKey(students[0], students[1]);
            notSame.put(key, 0);
        }

        int G = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < G; i++) {
            String[] group = scanner.nextLine().split(" ");
            String[] keys = {
                getSortedKey(group[0], group[1]),
                getSortedKey(group[1], group[2]),
                getSortedKey(group[0], group[2])
            };

            for (String key : keys) {
                if (same.containsKey(key)) {
                    same.put(key, 0);
                }
                if (notSame.containsKey(key)) {
                    notSame.put(key, 1);
                }
            }
        }

        int violations = same.values().stream().mapToInt(Integer::intValue).sum()
                        + notSame.values().stream().mapToInt(Integer::intValue).sum();

        System.out.println(violations);

        scanner.close();
    }
}

