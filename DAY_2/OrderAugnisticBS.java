public class OrderAugnisticBS{

    public static void main(String[] args){

        int[] arr1 = {1,3,5,8,9,14,17,22 };

        int[] arr2 = {22,17,14,9,8,5,3,1};

        int ans = orderAugnosticBinarySearch(arr2,14);
        System.out.println(ans);

    }

    static int orderAugnosticBinarySearch(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;
        
        boolean order = arr[start]<arr[end];

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                if(order){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(order){
                    end = mid-1;
                }else{
                    start= mid+1;
                }
            }
        }
        return -1;
    }
}