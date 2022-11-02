import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if(map.get(num) == null){
                map.put(num,1);
            }else{
                return true;
            }
        }
        return false;
    }
}