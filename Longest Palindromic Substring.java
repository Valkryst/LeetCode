public class Solution {
    public String longestPalindrome(final String string) {
        String longestSubstring = "" + string.charAt(0);
        String substring = null;

        for (int i = 0 ; i < string.length() ; i++) {
            for (int j = i ; j < string.length() ; j++) {
                substring = string.substring(i, j + 1);

                if (longestSubstring == null || substring.length() > longestSubstring.length()) {
                    if (this.isPalindrome(substring)) {
                        longestSubstring = substring;
                    }
                }
            }
        }

        return longestSubstring;
    }

    /**
     * Determines whether the given {@link String} contains a palindrome.
     *
     * @param string {@link String} to check.
     */
    private boolean isPalindrome(final String string) {
        for (int i = 0 ; i < (string.length() / 2) ; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
