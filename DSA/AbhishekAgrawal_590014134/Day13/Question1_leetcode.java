class Question1_leetcode {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z0-9]", " ");

        Set<String> bannedSet = new HashSet<>();

        for (String word : banned) {
            bannedSet.add(word);
        }

        HashMap<String, Integer> map = new HashMap<>();

        String[] words = paragraph.split("\\s+");

        String ans = "";
        int max = 0;

        for (String word : words) {

            if (word.length() == 0) continue;

            if (!bannedSet.contains(word)) {

                int freq = map.getOrDefault(word, 0) + 1;
                map.put(word, freq);

                if (freq > max) {
                    max = freq;
                    ans = word;
                }
            }
        }

        return ans;
    }
}