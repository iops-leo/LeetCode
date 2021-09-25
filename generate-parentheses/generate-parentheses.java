import java.util.ArrayList;
import java.util.List;
class Solution {
    private int N;
    public List<String> generateParenthesis(int n) {
        N = n;
        ArrayList<String> result = new ArrayList<>();
        dfs(result, new char[n*2],0,0);
        return result;
    }

    public void dfs(ArrayList<String> result, char[] select, int left, int right){
        if(left == N && right == N){
            StringBuilder s = new StringBuilder();
            for (char c : select) {
                s.append(c);
            }
            result.add(s.toString());
            return;
        }
        if(left > N || right > N){
            return;
        }

        if(left < right){
            return;
        }
        select[left+right] = '(';
        dfs(result, select, left+1, right);
        select[left+right] = ')';
        dfs(result, select, left, right+1);
    }
}