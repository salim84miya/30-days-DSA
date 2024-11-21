import java.util.*;

public class ReachNumber{
    public static void main(String[] args){

        int target =2;
        int ans = reachNumber(target);

        System.out.println(ans);

    }

    static int reachNumber(int target){

        int sum=0;
        int steps=0;

        while(sum<target){
            steps+=1;
            sum+=steps;
        }

        while(Math.abs(sum-target)%2!=0){
            steps+=1;
            sum+=steps;
        }

        return steps;
    }
}