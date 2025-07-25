# Problem: Maximum Nesting Depth of Parentheses

## Description:
Given a valid parentheses string `s`, return the nesting depth of `s`.

## Approach:
- Iterate through each character.
- Increment depth on encountering '(' and decrement on ')'.
- Track the maximum depth encountered during the traversal.

## Code (Java):
```java
class Solution {
    public int maxDepth(String s) {
        int depth = 0, max = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') depth++;
            if (c == ')') depth--;
            max = Math.max(max, depth);
        }
        return max;
    }
}
```