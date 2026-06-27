class Question2 {

    public String betterString(String s1, String s2) {

        long count1 = countDistinct(s1);
        long count2 = countDistinct(s2);

        return count1 >= count2 ? s1 : s2;
    }

    private long countDistinct(String s) {

        int n = s.length();

        long[] dp = new long[n + 1];
        dp[0] = 1;

        HashMap<Character, Integer> last = new HashMap<>();

        for (int i = 1; i <= n; i++) {

            char ch = s.charAt(i - 1);

            dp[i] = 2 * dp[i - 1];

            if (last.containsKey(ch)) {
                dp[i] -= dp[last.get(ch) - 1];
            }

            last.put(ch, i);
        }

        return dp[n];
    }
}