# Day 24 - Count Good Numbers

## 📌 Problem Statement
A digit string is good if:
- Digits at even indices (0-indexed) are even.
- Digits at odd indices are prime (2, 3, 5, or 7).

Given an integer `n`, return the total number of good digit strings of length `n`.
Answer must be returned modulo 10^9 + 7.

### Example
```
Input: n = 1
Output: 5
```

## 🚀 Approach
- Count how many digits can go at **even** and **odd** positions.
- At even positions, we can choose from {0,2,4,6,8} → 5 options.
- At odd positions, we can choose from {2,3,5,7} → 4 options.
- Use **fast exponentiation** to compute large powers efficiently.

## 💻 Code
See [`Solution.java`](Solution.java)

## 🏆 Complexity
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)
