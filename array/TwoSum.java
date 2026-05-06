public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] ans = new int[2];

        for(int i=0; i<nums.length; i++) {
            
            if (sum == 1) {
                break;
            }

            for(int j=0; j<nums.length; j++) {

                if(i==j) {
                    continue;
                }

                else if(nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    sum += 1;
                }
            }
        }
        return ans;
    }
}