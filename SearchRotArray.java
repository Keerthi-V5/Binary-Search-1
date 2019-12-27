package Day3;

public class SearchRotArray {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] >= nums[low]){
                if(target >= nums[low] && target < nums[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(target <= nums[high] && target > nums[mid]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}