public class order_agnostic_binary_search {
    public static void main(String[] args) {
        int[] nums = {7,5,3,2,1};
        int target = 5;
        int ans = findtarget(nums, target);
        System.out.println(ans);
    }

    public static int findtarget(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;
        boolean assnums = nums[start] < nums[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (assnums) {  //assending order
                if (target < nums[mid]) {
                    start = mid - 1;
                } else {
                    end = mid + 1;
                }
            } else {  // Descending order
                if (target > nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}


