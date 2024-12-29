import java.util.*;

public class BubbleSort{

    public static void main(String[] args){

        int[] arr = {23,1,10,5,3};

        int[] ans = bubbleSort(arr);

        System.out.println(Arrays.toString(ans));
    }

    private static int[] bubbleSort(int[] arr){

        boolean isSwapped;

        for(int i=0; i<arr.length; i++){
            isSwapped = false;
            for(int j=0; j<arr.length-1; j++){

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(isSwapped==false){
                break;
            }
        }
        return arr;
    }
}