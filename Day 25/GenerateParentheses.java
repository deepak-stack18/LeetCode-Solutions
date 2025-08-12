
// LeetCode #22 - Generate Parentheses
// Author: Deepak Gupta
// Language: Java

import java.util.*;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int max) {
        // If the current string length matches 2*n, it's a valid combination
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        // Add an open bracket if we still have one left
        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }
        // Add a closing bracket if it won't lead to invalid sequence
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        GenerateParentheses gp = new GenerateParentheses();
        System.out.println(gp.generateParenthesis(3));
    }
}
