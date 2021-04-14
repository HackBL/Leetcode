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
        ListNode curr = head;
        int cnt = 0;
        
        while (cnt != k && curr != null) {
            cnt++;
            curr = curr.next;
        }
        
        if (cnt == k) {
            curr = reverseKGroup(curr, k);
            
            while (cnt-- > 0) {
                ListNode next = head.next;
                head.next = curr;
                curr = head;
                head = next;
            }
            head = curr;
        }
        
        return head;
    }
}