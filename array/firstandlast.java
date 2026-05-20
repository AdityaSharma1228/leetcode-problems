public class firstandlast {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        int check = 0;
        int index = 0;
        int[] ans = new int[2];

        while(low <= high) {
            mid = (low + high)/2;
           if(nums[mid] > target) {
            high = mid-1;
           }
           else if(nums[mid] < target) {
            low = mid+1;
           }
           else if(nums[mid]==target) {
             index = mid;
             high = mid -1;
             check++;
            }
    
        }
        ans[0] = index;
        low = 0;
        mid = 0;
        high = nums.length-1;

        while(low <= high) {
            mid = (low + high)/2;
           if(nums[mid] > target) {
            high = mid-1;
           }
           else if(nums[mid] < target) {
            low = mid+1;
           }
           else if(nums[mid]==target) {
             index = mid;
             low = mid + 1;
             check++;
            }
    
        }

        ans[1] = index;


        if(check==0) {
                ans[0] = -1;
                ans[1] = -1;
                return ans;
    }

    return ans;

    }


}