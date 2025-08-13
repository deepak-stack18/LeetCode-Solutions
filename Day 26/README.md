# Day 26 - Combination Sum & Combination Sum II (Recursion + Backtracking)

## Problems
1. **Combination Sum (LeetCode #39)**  
   - Find all unique combinations of numbers where candidates can be chosen multiple times.

2. **Combination Sum II (LeetCode #40)**  
   - Find all unique combinations of numbers where each number may be used only once.

## Approach
- **Recursion + Backtracking** to explore all possible combinations.
- **Combination Sum** allows element reuse (pick/skip strategy).
- **Combination Sum II** uses sorting and skips duplicates to ensure unique results.

## Key Concepts
- Base cases: target reached or exceeded.
- Backtracking: choose → explore → undo.
- Pruning to avoid unnecessary recursion.
- Duplicate handling using sorted array.

## Time Complexity
- **Combination Sum:** O(2^n) worst case.
- **Combination Sum II:** O(2^n) worst case, reduced by pruning.

## Language
Java

---
