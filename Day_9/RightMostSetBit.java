public class RightMostSetBit{

    public static void main(String[] args){

        int input= 8;

        System.out.println(rightMostSetBit(input));
    }

    public static int rightMostSetBit(int input){

        int mask =1;
        boolean foundBit = false;
        int pos =0;

        while(foundBit!=true){
            if((input & mask)==mask){
                foundBit = true ;
                return pos;
            }else{
                mask = mask<<1;
            }
        }

        return -1;

    }
}