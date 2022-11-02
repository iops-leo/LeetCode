import java.util.ArrayList;
import java.util.HashMap;

class Solution {
public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : nums1) {
            map1.put(i, map1.getOrDefault(i,0)+1);
        }

        for (int i : nums2) {
            map2.put(i, map2.getOrDefault(i,0)+1);
        }

        for (Integer integer : map1.keySet()) {
            if(map2.containsKey(integer)){
                if(map1.get(integer) <= map2.get(integer)){
                    int N = map1.get(integer);
                    for (int i = 0; i < N; i++) {
                        list.add(integer);
                    }
                }else{
                    int N = map2.get(integer);
                    for (int i = 0; i < N; i++) {
                        list.add(integer);
                    }
                }
            }
        }
        int[] arr1 = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i++) {
            arr1[i] = list.get(i).intValue();
        }
        return arr1;
    }
}