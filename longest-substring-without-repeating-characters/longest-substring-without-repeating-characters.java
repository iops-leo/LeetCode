import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int i = 0;
        int j = 0;
        while(i < s.length()){
            if(set.contains(s.charAt(i))){
                max = Math.max(max,set.size());
                set.remove(s.charAt(j));
                j++;
            }else{
                set.add(s.charAt(i));
                i++;
            }
            max = Math.max(max,set.size());
        }
        return max;
    }
}