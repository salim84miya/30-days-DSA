public class MagicNo{

    public static void main(String[] args){

        int n= 5;

        System.out.println(magicNumber(n));
    }

    public static int magicNumber(int n){

        int base =5;
        int result =0;

        while(n>0){
            if((n&1)==1){
                result +=base;
            }
            base *= base;
            n = n >> 1;
        }
        return result;
    }
}