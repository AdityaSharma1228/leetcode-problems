class insertPosition {
    public int searchInsert(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        boolean found = false;
        int ans = 0;

        while(low <= high) {
            mid = (low+high)/2;

            if(nums[mid] > target) {
                high = mid-1;
            }
            else if(nums[mid] < target) {
                low = mid+1;
            }
            else if(nums[mid]==target) {
                found = true;
                ans = mid;
                return ans;
            }

        }

        if(!found && nums[mid]>target) {
            ans = mid;
            return ans;
        }

        else if(!found && nums[mid] < target) {
            ans = mid+1;
            return ans;
        }
        return ans;
    }
}