import java.util.*;

public class SortedMatrix{

    public static void main(String[] args){

        int[][] arr = {{10,20,30,40},
                        {15,25,35,45},
                        {28,29,37,49},
                        {33,34,38,50}};

        int[][] arr2 = {{1,2,3,4},
                        {5,6,7,8},
                       {9,10,11,12},
                      {13,14,15,16}};                

       

    // int target = 38;
    
    // int[] ans =  increasingOrderArray(arr,target);

    // System.out.println(Arrays.toString(ans));

    int target = 7;
    
    int[] ans = sortedMatrix(arr2,target);

    System.out.println(Arrays.toString(ans));

    }

    static int[] increasingOrderArray(int[][] arr,int target){

        int row = 0;
        int col = arr.length-1;

        while(col>=0 && row<arr.length){
            if(arr[row][col]>target){
                col--;
            }else if(arr[row][col]<target){
                row++;
            }else{
                return new int[] {row,col};
            }
        }
        return new int[] {0,0};
    }

    static int[] sortedMatrix(int[][] arr,int target){

        var rstart = 0;    
        var rend = arr[0].length-1;
        var colstart = 0;
        var colend = arr[0].length-1;
        int cmid=0;
        int rmid=0;

        while(rstart<rend-1){
                 rmid = rstart +(rend-rstart)/2;
                cmid = colstart+(colend-colstart)/2;

            if(arr[rmid][cmid]>target){
                rend = rmid;
            }else if(arr[rmid][cmid]<target){
                rstart = rmid;
            }else{
                return new int[]{rmid,cmid};
            }
        }

    if(arr[rstart][cmid]>=target){

       return binarySearch(arr[rstart], target,0,cmid,rstart);
  
    }else if(arr[rstart][colend]>=target){
        
        return binarySearch(arr[rstart], target,cmid+1,colend,rstart);
    
    }else if(arr[rend][cmid]>=target){

        return binarySearch(arr[rend], target,0,cmid,rend);

    }else{
        
        return binarySearch(arr[rend], target,cmid+1,colend,rend);
    }
}

    static int[] binarySearch(int arr[],int target,int start,int end,int row){
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]<target){
                start= mid+1;
            }else if(arr[mid]>target){
                end = mid-1;
            }else{
                return new int[]{row,mid};
            }
        }
        return new int[]{0,0};
    }
}