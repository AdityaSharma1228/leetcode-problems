class singleElementinSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        
       if(nums.length==1) {
        return nums[0];
       }

       if(nums[0]!=nums[1]) {
        return nums[0];
       }

       if(nums[nums.length-1]!=nums[nums.length-2]) {
        return nums[nums.length-1];
       }

       while(low<=high) {
        mid = (low + high)/2;
        if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) {
            return nums[mid];
        }
        int f=mid; // f-> first and s-> second 
        int s=mid;
        if(nums[mid]==nums[mid-1]) {
            f = mid -1;
        }
        else {
            s = mid+1;
        }

        int left = f-low;
        int right = high-s;

        if(left%2==0) {
            low = s+1;
        }
        else {
            high = s-1;
        }


       }
        return nums[low];
    }
}