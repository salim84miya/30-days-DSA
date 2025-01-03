import java.util.*;
import java.lang.Math;

public class DigitOfNumber{

    public static void main(String[] args){

        int number = 4;
        int base = 2;

        int digits = (int)(Math.log(number)/Math.log(base));

        int result = digits +1;

        System.out.println(result); 
    }
}