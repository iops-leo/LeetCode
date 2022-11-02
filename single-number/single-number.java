import java.util.HashMap;
class Solution {
    public int singleNumber(int[] nums) {
                HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if(map.get(num) == null){
                map.put(num,1);
            }else{
                map.put(num,map.get(num)+1);
            }
        }
        for (Integer integer : map.keySet()) {
            if(map.get(integer) == 1){
                return integer;
            }
        }
        return 0;
    }
}