/**
 * Problem: Pascal's Triangle
 * Link: https://leetcode.com/problems/pascals-triangle/
 * Language: Java
 * Topic: Arrays, Math, Dynamic Programming
 */

import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();
            int ans = 1;
            currentRow.add(ans);
            for (int col = 0; col < row; col++) {
                ans = ans * (row - col) / (col + 1);
                currentRow.add(ans);
            }
            triangle.add(currentRow);
        }
        return triangle;
    }
}
