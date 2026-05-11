public class commonElements {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] arr = new int[2];
        int n1_answer = 0;
        int n2_answer = 0;
        for(int i=0; i<nums1.length; i++) {
            for(int j=0; j<nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    n1_answer++;
                    break;
                }
            }
        }

        for(int i=0; i<nums2.length; i++) {
            for(int j=0; j<nums1.length; j++) {
                if(nums2[i] == nums1[j]) {
                    n2_answer++;
                    break;
                }
            }
        }
        arr[0] = n1_answer;
        arr[1] = n2_answer;
        return arr;
    }
}