package Day3;

public class SearchRotSortArr {

    private int search(int arr[], int target){

        if(arr == null || arr.length == 0) {
            return -1;
        }

        int l = 0;
        int h = arr.length - 1;

        while(l <= h){

            int mid = l + (h-l)/2;


            if(target == arr[mid]) {
                return mid;
            }

            //checking if left side of mid is sorted
            else if(arr[l] <= arr[mid]){
                //checking if target value lies within the left
                if(target < arr[mid] && target >= arr[l]){
                    h = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }
            //if left part is not sorted right will be sorted
            //check if target lies on the right side
            else{
                if(target > arr[mid] && target <= arr[h]){
                    l = mid + 1;
                }
                else{
                    h = mid - 1;
                }
            }

        }

        return -1;

    }
    public static void main(String args[]){

        int arr[] = new int[]{4,5,6,7,8,9,10,0,1,2,3};

        SearchRotSortArr obj = new SearchRotSortArr();

        System.out.println("The target element is found at the index: "+obj.search(arr,5));

    }
}
