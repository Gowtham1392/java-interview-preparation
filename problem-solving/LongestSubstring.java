// Link to problem -> https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        if(c.length == 0) return 0;
        Set<Character> set = new HashSet<>();
        int longest = 1;
        int count = 0;
        for(int i = 0; i < c.length; i++){
            set.clear();
            if(count >= longest) longest = count;
            set.add(c[i]);
            count = 1;
            for(int j = i + 1; j < c.length; j++){
                if(set.add(c[j])) count++;
                else break;
            }
        }
        return longest;
    }
}
