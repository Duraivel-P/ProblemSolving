class MedianArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int mergedArray[] = merge(nums1, nums2);
        
        int mid = (0+mergedArray.length-1)/2;
        
        if(mergedArray.length%2==0)
        {
        double total = (mergedArray[mid] + mergedArray[mid+1]);
        return total/2;
        }
        
        return mergedArray[mid];
        
    }
    
    private static int[] merge(int arr1[], int arr2[])
	{
		
		int size = Math.min(arr1.length, arr2.length);
		
		int arr3[] = new int[arr1.length+arr2.length];
		
		int j = 0;
		int i = 0;
		int k =0;
		
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				arr3[k++] = arr1[i++];
			}			
			else
			{
				arr3[k++] = arr2[j++];
			}

		}
		
		for(;i<arr1.length;i++)
		{
			arr3[k++] = arr1[i];
		}
		
		for(;j<arr2.length;j++)
		{
			arr3[k++] = arr2[j];
		}

        return arr3;
	}
}
