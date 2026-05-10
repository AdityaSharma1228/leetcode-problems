public class moveZero {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int temp = 0;
        int swap = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                count++;
            }
        }
        if(swap != count) {
            for(int i=0; i<nums.length-1; i++) {
            for(int j=0; j<nums.length-1; j++) {
                if(nums[j] == 0) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swap++;
                }
            }
        }
        
        }
    }
}