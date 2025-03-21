public class Solution {
    public int lengthOfLongestSubstring(final String s) {
        if (s.length() == 1) {
            return 1;
        }

        int longestLength = 0;

        final Set<Character> set = new LinkedHashSet<>();
        for (int i = 0 ; i < s.length() ; i++) {
            for (int j = i ; j < s.length() ; j++) {
                final char c = s.charAt(j);

                if (set.contains(c)) {
                    break;
                }

                set.add(c);
            }

            if (set.size() > longestLength) {
                longestLength = set.size();
            }
            set.clear();
        }

        return longestLength;
    }
}
