public class target{
    puclic static int binarySearch(int[]array, int targe){
        int left=0;
        int right=array.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(array[mid]==targe){
                return mid;
            }
            if(array[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}