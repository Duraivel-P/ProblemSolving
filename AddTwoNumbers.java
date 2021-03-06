import java.lang.*;

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
class AddTwoNumbers {
   ListNode finalList =null;
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // ListNode reverse1 = this.reverse(l1);
        // ListNode reverse2 = this.reverse(l2);
        addTwoNode(l1, l2);
      //  System.out.println(this.getAt(0,reverse1).val);
       // System.out.println(this.getSize(reverse1));
        return this.reverse(finalList);
    }
    
 
    private ListNode addTwoNode(ListNode node1, ListNode node2)
    {
        
        int maxSize = Math.max(getSize(node1),getSize(node2));
        int carry = 0;
        
        for(int i=0;i<maxSize;i++)
        {
                
            int total = getDataFromNode(i,node1) + getDataFromNode(i,node2) + carry;       
            if(total>9)
            {
                carry = total/10;
                total = total%10;
            }
            else {
                carry =0;
            }
            insert(total);                  
        }
      
        if(carry !=0)
        {
            insert(carry);         
        }
        
        return finalList;
    }
    
    private int getDataFromNode(int i, ListNode node)
    {
        if(getSize(node)<i)   
        {
           return 0; 
        }
        
        ListNode temp =  getAt(i,node);
        if(temp!=null)
         {
           return temp.val;  
        }
        return 0;
    }
    private int getSize(ListNode list)
    {
        int i=0;
        while(list!=null)
        {
            i=i+1;
            list = list.next;
        }
        return i;
    }
    
    private ListNode getAt(int position, ListNode list)
    {

        
        for(int i=0;i<position;i++)
        {
            list = list.next;
        }
        return list;        
    }
    
    private ListNode reverse(ListNode l1)
    {
        ListNode prev = null;
        if(l1 == null)
        {
            return l1;
        }
        while(l1!=null)
        {
            ListNode next = l1.next;            
            l1.next = prev;
            prev = l1;
            l1 = next;                      
        }
       return prev;
    }
    
    private void insert(int data)
    {
        
        if(finalList==null)
        {
            finalList = getNewNode(data);
        }
        else 
        {
            ListNode current =  getNewNode(data);
            current.next = finalList;
            finalList = current;
        }
    }
    
    private ListNode getNewNode(int data)
    {
        ListNode listNode = new ListNode();
        listNode.val = data;
        listNode.next = null;
        return listNode;
    }
}
