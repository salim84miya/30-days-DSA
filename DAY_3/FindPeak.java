public class FindPeak {
    public static void main(String[] args){

        int[] arr = {1,5,4,3,2,3,2};

        int ans = findPeak(arr);
        System.out.println(ans);
    }

    static int findPeak(int[] arr){

        int start=1;
        int end =arr.length-2;

        if(arr[0]>arr[start]){
            return 0;
        }else if(arr[arr.length-1]>arr[end]){
            return arr.length-1;
        }

        while(start<=end){
            int mid = start +(end-start)/2;

            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }else if(arr[mid]<arr[mid+1]){
                start= mid+1;
            }else if(arr[mid]<arr[mid-1]){
                end = mid-1;
            }else{
                start= mid+1;
            }
        }

        return -1;
    }
}
