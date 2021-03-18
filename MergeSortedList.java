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
class MergeSortedList {
    ListNode headl3 = null;
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            
        while(l1!=null && l2!=null)
        {
            if(l1.val < l2.val)
            {
                insert(l1.val);
                l1 = l1.next;
            }
            else {
                insert(l2.val);
                l2 = l2.next;
            }
        }
        
        while (l1!=null)
        {
            insert(l1.val);
            l1=l1.next;
        }
        
        while (l2!=null)
        {
            insert(l2.val);
            l2=l2.next;
        }
        
        return reverse(headl3);    
    }
    
    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        
        if(head==null)
        {
            return head;
        }
        
        while(head!=null)
        {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    
    public void insert(int val)
    {
        if (headl3==null)
        {
            headl3 = new ListNode(val, null);
        }
        else 
        {
           ListNode temp = new ListNode(val);
           temp.next = headl3;
           headl3 = temp;    
        }
    }
}
