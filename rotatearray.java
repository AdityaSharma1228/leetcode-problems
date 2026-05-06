public class rotatearray {
    public void rotate(int[] nums, int k) {
       int num = nums.length;
        int index = 0;
        int[] arr = new int[nums.length];

        if(k>nums.length) {
            k = k%nums.length;
        }

        int arr_index = num - k;

        for(int i=0; i<k; i++) {
            arr[i] = nums[arr_index];
            arr_index++;
        }

        for(int j=k; j<nums.length; j++) {
            arr[j] = nums[index];
            index++;
        }

        for(int l=0; l<nums.length; l++) {
            nums[l] = arr[l];
        }
    }
}