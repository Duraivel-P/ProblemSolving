class RemoveDuplicates {
    
 public static int removeDuplicates(int[] nums) {
        int i= 0;
        int k =0;
        int j = 1;
        int length = nums.length;
      
        if(length==0)
        {
            return k;
        }
        
        while(i<length&& j<length)
        {
            if(nums[i] != nums[j])
            {    
              nums[k++] = nums[i]; 
            }
            i++;
            j++;
        }
      
        nums[k++] = nums[length-1];
      
        return k;
    }

}
