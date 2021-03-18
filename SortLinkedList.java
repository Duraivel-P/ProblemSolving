class SortLinkedList {
    
    public ListNode sortList(ListNode head) {
        int arr[] = listToArray(head);
        int size = getSizeOf(head);
        mergeSort(arr, 0, size-1);    
        return arrayToList(arr);
    }
    
    public void mergeSort(int arr[], int l, int r)
    {
        if(l<r)
        {
        int mid = l+(r-l)/2;
        mergeSort(arr, l,mid);
        mergeSort(arr,mid+1,r);
        mergeSubArray(arr,l,r,mid);
        }
        
    }
    
    public void mergeSubArray(int arr[], int l , int r, int m)
    {
       
       int left []  = new int[m-l+1];
       int right [] = new int[r-m];
        
       for(int i=0;i<left.length;i++)
       {
           left[i] = arr[l+i];
       }
        
       for(int i=0;i<right.length;i++)
       {
           right[i] = arr[m+i+1];
       }
       
        int j =0;
        int k=0;
        
        while(j<left.length && k<right.length)
        {
            if(left[j]<right[k])
            {
                arr[l++] = left[j++];
            }
            else 
            {
                arr[l++] = right[k++];
            }
        }
        
        while(j<left.length)
        {
            arr[l++] = left[j++];
        }
        
        while(k<right.length)
        {
             arr[l++] = right[k++];
        }
        
    }
    
    public int getSizeOf(ListNode list)
    {
        int i =0;
        while(list!=null)
        {
            i++;
            list = list.next;
        }
        return i;
    }
    
     private int[] listToArray(ListNode head)
     {
         int temp[] = new int[getSizeOf(head)];
         int i =0;
         while(head!=null)
         {
             temp[i++] = head.val;
             head = head.next;
         }
         return temp;
     }
    
     private ListNode arrayToList(int arr[] )
     {
        ListNode out = null;
        for(int i=arr.length-1;i>=0;i--)
        {
           out = insert(out, arr[i]);
        }
       return out;
     }
    
    private ListNode insert(ListNode head , int val)
    {
        if(head==null)
        {
            head = new ListNode(val);
        }
        else            
        {
          ListNode temp = new ListNode(val);
          temp.next =head;
          head = temp;
        }
        return head;
    }
}
