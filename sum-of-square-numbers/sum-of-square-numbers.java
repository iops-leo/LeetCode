class Solution {
    public boolean judgeSquareSum(int c) {
        int left = 0;
        int right = (int)Math.sqrt(c);
        while(left<=right){
            int cur = left * left + right * right;
            if(cur < c){
                left++;
            }else if(cur > c){
                right--;
            }else{
                return true;
            }
        }
        return false;
    }
}