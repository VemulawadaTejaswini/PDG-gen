import java.util.*;

class Main {

    public static void main(String[] args) {
        Random in=new Random();
        int a=in.nextInt(13)+1;
        int b=in.nextInt(13)+1;
        int c=in.nextInt(13)+1;
        if((a+b+c)>=22){
            System.out.println("bust");
        }
        else {
            System.out.println("win");
        }
    }
}
