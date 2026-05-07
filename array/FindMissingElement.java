public class FindMissingElement {
    class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        boolean value = true;

        List<Integer> arrlis = new ArrayList<>();

        for(int i=1; i<nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }

        for(int i=1; i<nums.length; i++) {
            if(nums[i] < min){
                min = nums[i];
            }
        }

        int num = min + 1;

        while(num < max) {
            value = true;
            for(int i=0; i< nums.length; i++) {
                if(nums[i] == num){
                    value = false;
                    break;
                }
            }
            if(value == true) {
                    arrlis.add(num);
                }
            num++;
        }

        return arrlis;
    }
}
}