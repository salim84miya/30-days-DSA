package DAY_4;

import java.util.Arrays;

public class RightInterval {
    public static void main(String[] args){


        int[][] arr = new int[][]{{3,4},{2,3},{1,2}};

        int[] ans = rightInterval(arr);

        System.out.println(Arrays.toString(ans));

    }


    //for iterating over the array
    private static int[] rightInterval(int[][] arr){

        //check for single or element present case
        if(arr.length==0 || arr.length==1){
            return new int[]{-1};
        }

        //storing answer
        int[] ans = new int[arr.length];

        for(int i =0; i<arr.length; i++){

            //bs for every end of the internal arrays
          ans[i] = binarySearch2d(arr, arr[i][1], i);
        }

        return ans;
    }


    //actual bs method for checking
    //doing order augostic bs
    private static int binarySearch2d(int[][] arr,int target,int i){
       
        int start =0;
        int end = arr.length-1;

        boolean isAscending = arr[start][0]<arr[end][0];

        while(start<=end){
            int mid = start+(end-start)/2;
           
            if(target==arr[mid][0]){
                //return mid if start value are same to target elements end
                return mid;
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
   
        //if start value is greater than target value means it is the greatest minimized value so return it
        if(arr[start][0]>=arr[i][1]){
            return start;
        }else{
            //else no value present add -1
            return -1;
        }
    }
}
