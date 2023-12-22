package st;

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(13);
        int b=in.nextInt(13);
        int c=in.nextInt(13);
        if((a+b+c)>=22){
            System.out.println("bust");
        }
        else {
            System.out.println("win");
        }
    }
}
