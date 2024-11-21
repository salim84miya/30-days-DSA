package DAY_4;

import java.util.Arrays;

public class RightInterval {
    public static void main(String[] args){


        int[][] arr = new int[][]{{3,4},{2,3},{1,2}};

        int[] ans = rightInterval(arr);

        System.out.println(Arrays.toString(ans));

    }

    static int[] rightInterval(int[][] arr){

        if(arr.length==0 || arr.length==1){
            return new int[]{-1};
        }

        int[] ans = new int[arr.length];

        for(int i =0; i<arr.length; i++){
            int start =0;
            int end = arr.length-1;

            boolean isAscending = arr[start][0]<arr[end][0];

            while(start<=end){
                int mid = start+(end-start)/2;
                if(arr[i][1]==arr[mid][0]){
                    ans[i] = mid;
                    break;
                }else if(isAscending){
                    if(arr[i][1]>arr[mid][0]){
                        start = mid+1;
                    }else{
                        end = mid-1;
                    }
                }else{
                    if(arr[i][1]>arr[mid][0]){
                        end = mid-1;
                    }else{
                        start = mid+1;
                    }
                }
            }

            if(arr[start][0]>=arr[i][1]){
                ans[i] = start;
            }else{
                ans[i]= -1;
            }
        }

        return ans;
    }
}
