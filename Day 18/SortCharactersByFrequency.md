# Problem: Sort Characters by Frequency

## Description:
Given a string, sort it in decreasing order based on the frequency of characters.

## Approach:
- Use HashMap to count frequency of each character.
- Use PriorityQueue (max heap) or sort with custom comparator.
- Build result string based on character frequency.

## Code (Java):
```java
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> chars = new ArrayList<>(map.keySet());
        chars.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            int freq = map.get(c);
            for (int i = 0; i < freq; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
```