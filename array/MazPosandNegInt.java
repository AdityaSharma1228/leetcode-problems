class MazPosandNegInt {
    public int maximumCount(int[] nums) {
        int ans = 0;
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        int posf = -1;
        int posl = -1;
        int pos = 0;
        int neg = 0;

        //for negative
        while(low <= high) {
            mid = (low+high)/2;

            if(nums[mid] >= 0) {
                high = mid-1;
            }
            else if(nums[mid] < 0) {
                neg = mid + 1;
                low = mid + 1;
            }
        }

        low = 0;
        high = nums.length-1;

        //for positive
            //first occurance
        while(low <= high) {
            mid = (low+high)/2;

            if(nums[mid] > 0) {
                posf = mid + 1;
                high = mid-1;
            }
            else if(nums[mid] <= 0) {
                low = mid + 1;
            }
        }

            //last occurance

        low = 0;
        high = nums.length-1;

        while(low <= high) {
            mid = (low+high)/2;

            if(nums[mid] > 0) {
                posl = mid + 1;
                low = mid+1;
            }
            else if(nums[mid] <= 0) {
                low = mid + 1;
            }
        }

        if(posf!=-1 && posl!=-1) {
            pos = posl -posf + 1;

        }
        else {
            pos = 0;
        }

        if(pos > neg) {
            ans = pos;
            return pos;
        }
        else {
            ans = neg;
            return ans;
        }
    }
}