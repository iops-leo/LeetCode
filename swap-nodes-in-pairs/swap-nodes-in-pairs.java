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
class Solution {
public ListNode swapPairs(ListNode head) {
        return swap(head, 0);
    }

    public ListNode swap(ListNode head, int i){
        if(head == null){
            return null;
        }
        ListNode node = swap(head.next, i+1);
        if(node != null && i%2 == 0){
            head.next = node.next;
            node.next = head;
            return node;
        }else if(node != null && i%2 == 1){
            head.next = node;
            return head;
        }
        return head;
    }
}