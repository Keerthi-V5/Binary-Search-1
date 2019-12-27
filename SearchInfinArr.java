package Day3;

public class SearchInfinArr {

    private int search(int arr[], int target){
        int l = 0;
        int h = 1;

        while(target > arr[h]){
            l = h;
            h = h * 2;
        }
        return binSearch(arr, l, h, target);
    }

    private int binSearch(int arr[], int l, int h, int target){
        while(l <= h){

            int mid = l + (h-l) /2;
            System.out.println(mid);
            if(arr[mid] == target) {
                return mid;
            }

            else if(target < arr[mid]){
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String args[]){

        int arr[] = new int[]{3,5,7,10,11,15,16,17,18,19};

        SearchInfinArr obj = new SearchInfinArr();

        System.out.println("The target element is found at the index: "+ obj.search(arr,18));
     }
}
