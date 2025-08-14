
// LeetCode #216: Combination Sum III
// Approach: Backtracking with pruning
import java.util.*;

class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int k, int n, List<Integer> temp, List<List<Integer>> result) {
        if (k == 0 && n == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        if (k < 0 || n < 0) return;

        for (int i = start; i <= 9; i++) {
            temp.add(i);
            backtrack(i + 1, k - 1, n - i, temp, result);
            temp.remove(temp.size() - 1);
        }
    }
}
