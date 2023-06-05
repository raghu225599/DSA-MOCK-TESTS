/** Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1

Constraints:
a. 1 <= s.length <= 10^5
b. s consists of only lowercase English letters.
*/
public class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "leetcode";

        FirstUniqueChar fuc = new FirstUniqueChar();
        int index = fuc.firstUniqChar(s);
        System.out.println(index);
    }

    private int firstUniqChar(String s) {
        int[] frequency = new int[26];


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frequency[c - 'a']++;
        }


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (frequency[c - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
