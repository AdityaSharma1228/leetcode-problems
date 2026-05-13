public class Occurence  {
    class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        
        int count = 0;
        int index = 0;
        int[] arr = new int[nums.length];
        int[] ans = new int[queries.length];

        for(int i=0; i<nums.length; i++) {
            if(nums[i]==x) {
                arr[index] = i;
                index++;
                count++;
            }
        }

        for(int j=0; j<queries.length; j++) {
            if(queries[j] <= count) {
                ans[j] = arr[queries[j]-1];
            }
            else {
                ans[j] = -1;
            }
        }
        return ans;

    }
}
}