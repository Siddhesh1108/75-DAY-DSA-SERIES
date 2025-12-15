
// 1941. Check if All Characters Have Equal Number of Occurrences(LeetCode)
// Given a string s, return true if s is a good string, or false otherwise.
// A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

// Example 1:
// Input: s = "abacbc"
// Output: true
// Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.

// Example 2:
// Input: s = "aaabb"
// Output: false
// Explanation: The characters that appear in s are 'a' and 'b'.
// 'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
 
// Constraints:
// 1 <= s.length <= 1000
// s consists of lowercase English letters.

class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];

        
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int expected = 0;

        
        for (int count : freq) {
            if (count > 0) {
                if (expected == 0) {
                    expected = count;
                } else if (count != expected) {
                    return false;
                }
            }
        }
        return true;
    }
}
