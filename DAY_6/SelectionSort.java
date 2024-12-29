import java.util.*;

public class SelectionSort{

    public static void main(String[] args){

        int[] arr = {23,1,10,5,3};

        int[] ans = selectionSort(arr);

        System.out.println(Arrays.toString(ans));

    }

    private static int[] selectionSort(int[] arr){

        for(int i=0; i<arr.length; i++){
                int smallest =i;
            for(int j=i; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest]= temp;
        }

        return arr;

    }
}