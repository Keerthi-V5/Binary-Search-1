package Day3;

public class SearchArrayLenUn {

    public int search(ArrayReader reader, int target) {

        if(reader.get(0) == target) return 0;

        int low = 0;
        int high = 1;

        while(reader.get(high) < target){
            low = high;
            high <<= 1;
        }

        int mid = 0;
        int num = 0;

        while(low <= high){
            mid = (low+high)/2;

            num = reader.get(mid);

            if(num == target) return mid;
            if(num > target) high = mid - 1;
            else low = mid + 1;
        }

        return -1;
    }
}
