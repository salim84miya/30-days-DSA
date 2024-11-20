import java.util.Scanner;

public class CeilingNumber{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter targer value:");
        int input = sc.nextInt();

        int[] arr = new int[6];


        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int ans = ceilingNumber(arr,input);

        System.out.println("index: "+ans);

    }

    static int ceilingNumber(int[] arr,int target){

        int start=0;
        int end=arr.length-1;

        boolean order = arr[start]<arr[end];

        int ans = -1;

        while(start<=end){

            int mid = start +(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }else if(order){
                if(arr[mid]<target){
                    start = mid+1;
                }else{
                    ans = mid;
                    end = mid-1;
                }
            }else{
                if(arr[mid]<target){
                    end = mid-1;
                }else{
                    ans = mid;
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}