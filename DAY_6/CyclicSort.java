import java.util.*;

public class CyclicSort{

    public static void main(String[] args){

        int[] arr = {2,4,1,5,3};
         int[] arr2 = {0,2,4,1,3};

        int[] ans = cyclicSort(arr2,true);

        System.out.println(Arrays.toString(ans));
    }

    private static int[] cyclicSort(int[] arr,boolean isZeroIncluded){

        for(int i=0; i<arr.length-1; ){

                int correct =0;
            if(isZeroIncluded){
                 correct = arr[i];
            }else{
                correct = arr[i]-1;
            }
            
            // keep checking till the correct element is placed of current position
            // for e.g if current pos is '1' so till '1' is placed at this position keep swaping

            if(arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
            
        }
        return arr;
    }
}