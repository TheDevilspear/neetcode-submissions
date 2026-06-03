class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Handle edge cases first: empty or null input
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take the first string as the initial common prefix
        String prefix = strs[0];

        // Iterate through the rest of the strings in the array
        for (int i = 1; i < strs.length; i++) {
            // Find the index of the current prefix in the current string
            // The indexOf method returns 0 if the string starts with the prefix
            // It will return a different number if it's found elsewhere, or -1 if not found at all
            while (strs[i].indexOf(prefix) != 0) {
                // If the prefix is not at the beginning of the current string, shorten it by one character
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes an empty string, there is no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}