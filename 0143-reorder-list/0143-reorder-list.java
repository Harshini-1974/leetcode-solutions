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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
      ListNode slow= head;
      ListNode fast=head;
      while(fast.next!=null && fast.next.next!=null)
      {
        slow=slow.next;
        fast=fast.next.next;
      }
      ListNode rev= reverse(slow.next);
        slow.next=null;

      ListNode fir=head;
       ListNode sec=rev;
    while(sec!=null)
    {
       
        ListNode fn=fir.next;
        ListNode sn=sec.next;
        fir.next=sec;
        sec.next=fn;
        fir=fn;
        sec=sn;
    
    }}

      private ListNode reverse (ListNode r)
      {
        ListNode curr=r;
        ListNode prev=null;
        ListNode next=null;
        while(curr != null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
    return prev;
      }
    
}