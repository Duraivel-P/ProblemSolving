class MaxProduct {
    public int maxProduct(int[] nums) {
        
        int i = 0;
        int first = 0;
        int second = 0;
        
        while(i<nums.length)
        {
            if(nums[i]>first)
            {   
                int temp =first;
                first = nums[i];
                second = Math.max(temp,second);
            }
            else
            {
                second = Math.max(second,nums[i]);
            }
            i++;
        }
        
        return (first-1) * (second-1);
    }
}
