public class SetBit{

    public static void main(String[] args){

        int input= 9;
        int bit = 2;

        System.out.println(setBit(input,bit));
    }


    public static int setBit(int input,int pos){

        int mask = 1<<pos;
        System.out.println(mask);
        return input | mask;

    }
}