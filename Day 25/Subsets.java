
// LeetCode #78 - Subsets
// Author: Deepak Gupta
// Language: Java

import java.util.*;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int total = 1 << n; // 2^n subsets

        for (int mask = 0; mask < total; mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    subset.add(nums[i]);
                }
            }
            result.add(subset);
        }
        return result;
    }

    public static void main(String[] args) {
        Subsets s = new Subsets();
        int[] nums = {1, 2, 3};
        System.out.println(s.subsets(nums));
    }
}
