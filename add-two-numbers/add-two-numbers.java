/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger number1 = new BigInteger(makeNumber(l1).toString());
        BigInteger number2 = new BigInteger(makeNumber(l2).toString());
        String result = String.valueOf(number1.add(number2));
        return makeNode(result,null,0);
    }

    public StringBuilder makeNumber(ListNode node){
        StringBuilder s = new StringBuilder();
        if(node == null){
            return s;
        }
        s.append(makeNumber(node.next));
        s.append(node.val);
        return s;

    }

    public ListNode makeNode(String s, ListNode n, int index){ //807
        if(index == s.length()){
            return n;
        }
        int val = Integer.parseInt(String.valueOf(s.charAt(index)));
        if(n == null){
            ListNode node = new ListNode(val,null);
            return makeNode(s,node,index+1);
        }else{
            ListNode node = new ListNode(val,n);
            return makeNode(s,node,index+1);
        }
    }
}