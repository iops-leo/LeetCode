class Solution {
    public void rotate(int[] nums, int k) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int index = (i+k)%nums.length;
            result[index] = nums[i];
        }
        for (int i = 0; i < result.length; i++) {
            nums[i] = result[i];
        }
    }
}