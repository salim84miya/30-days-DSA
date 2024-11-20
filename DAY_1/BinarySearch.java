public class BinarySearch{

    public static void main(String[] args){

        int[] arr = {1,4,9,12,16,19,21};

        int target =22;

        int ans = binarySearch(arr,target);

        System.out.println("index:"+ ans);
    }

    static int binarySearch(int[] arr,int target){

        int start =0;
        int end =arr.length-1;
        

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start= mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}