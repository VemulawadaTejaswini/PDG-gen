import java.util.*;
import java.lang.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        float s = w*h/2;
        int e;
        if(x == w/2 && y ==h/2 && w % 2 ==0 && h % 2==0){
            e =1;
        }else{
            e = 0;
        }



        System.out.println(s);
        System.out.println(e);

    }
}