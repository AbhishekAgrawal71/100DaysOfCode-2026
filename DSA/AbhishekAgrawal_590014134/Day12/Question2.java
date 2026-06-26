import java.util.*;
class Question2 {
    public int findSubString(String str) {
        int n = str.length();

        // Count total distinct characters
        HashSet<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }
        int distinctCount = set.size();

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int count = 0;

        for (int right = 0; right < n; right++) {
            char ch = str.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (map.get(ch) == 1) {
                count++;
            }

            // Shrink window
            while (count == distinctCount) {
                minLen = Math.min(minLen, right - left + 1);

                char leftChar = str.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                    count--;
                }

                left++;
            }
        }

        return minLen;
    }
}