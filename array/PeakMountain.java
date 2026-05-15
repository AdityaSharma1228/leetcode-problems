public class PeakMountain {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;   // peak is on the right
            } else {
                high = mid;      // peak is on the left (including mid)
            }
        }

        return low;  // or high (both point to peak)
    }
}