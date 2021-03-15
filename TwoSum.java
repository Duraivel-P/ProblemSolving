class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int output[] = new int[2];
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
            
        for(int i=0;i<n;i++)
        {
          if(!map.containsKey(nums[i]))
          {
              map.put(target-nums[i], i);
          }
          else {
             output[0] = map.get(nums[i]);;
             output[1] = i;
          }
        }
        
        return output;
    }
}
