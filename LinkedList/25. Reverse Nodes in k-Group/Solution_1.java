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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head.next == null || k == 1) return head;
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode first = dummy;
        int i = 0;
        
        while (head != null) {
            i++;
            if (i % k == 0) {
                first = reverse(first, head.next);
                head = first.next;
            } else {
                head = head.next;
            }
        }
        
        return dummy.next;
    }
    
    public ListNode reverse(ListNode begin, ListNode end) {
        ListNode curr = begin.next;
        ListNode first = curr;
        ListNode prev = begin;
        
        while (curr != end) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        begin.next = prev;
        first.next = curr;
        
        return first;
    }
}