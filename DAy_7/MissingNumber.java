import java.util.*;

public class MissingNumber{

    public static void main(String[] args){

        int[] arr = {3,4,2,2,5,1,3,4};

        ArrayList<Integer> ans = missingNumber(arr);

        System.out.println(ans.toString());
    }

    private static ArrayList<Integer> duplicateNumbers(int[] arr){

        arr = cycliSort(arr);

       

        ArrayList<Integer> answer = new ArrayList<Integer>();

         int i=0;

        while(i<arr.length){
            if(arr[i]!=(i+1)){
                answer.add(arr[i]);
            }
            i++;
        }

        return answer;
    } 

    private static ArrayList<Integer> missingNumber(int[] arr){

        arr = cycliSort(arr);

        ArrayList<Integer> answer = new ArrayList<Integer>();

        int i=0;

        while(i<arr.length){
            if(arr[i]!=(i+1)){
                answer.add(i+1);
            }
            i++;
        }

        return answer;
    }

    private static int[] cycliSort(int[] arr){

        for(int i=0; i<arr.length;){
           
                    System.out.println(Arrays.toString(arr));

            int correct = arr[i]-1;

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

    private static void swap(int a,int b){
        
        int temp = a;
        a = b;
        b = temp;
    }
}