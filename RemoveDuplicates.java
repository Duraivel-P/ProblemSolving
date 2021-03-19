class RemoveDuplicates {
    
  public static int removeDuplicates(int[] nums) {
        
        int count = 0;
        int i= 0;
        int k =0;
        int j = 1;
        int length = nums.length;
        int temp[] = new int[nums.length];
        
        while(i<length&& j<length)
        {
            if(nums[i] == nums[j])
            {    
               count++; 
            }
            else {         	
            temp[k++] = nums[i]; 
            }
            i++;
            j++;
        }
      
        if(nums.length!=0){
        temp[k++] = nums[j-1];
        }
      
        System.arraycopy(temp, 0, nums, 0, length);
        
        return k;
    }

}
