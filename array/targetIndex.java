public class targetIndex {
    public List<Integer> targetIndices(int[] nums, int target) {

        ArrayList<Integer> arr = new ArrayList<>();
        int index = 0;
        
        for(int i=0; i<nums.length-1; i++) {
            int min_Index = i;

            for(int j =i+1; j<nums.length; j++) {
                if(nums[min_Index]>nums[j]) {
                    min_Index = j;
                }
            }
            int temp = nums[min_Index];
            nums[min_Index] = nums[i];
            nums[i] = temp;
        }

        for(int i=0; i<nums.length; i++) {
            if(nums[i]==target){
                arr.add(i);
            }
        }
        return arr;
    }
}