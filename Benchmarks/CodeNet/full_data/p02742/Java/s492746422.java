import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        long h = in.nextLong();
        long w = in.nextLong();
        if(h==1 || w==1) {
            System.out.print(1);
            System.exit(0);
        }
        long x = (long) Math.ceil((double)w/2);
//        System.out.println(x);
        long y;
        if(w%2==0) y = x;
        else y = x - 1;
        long result;
        if(h%2==0) {
            result = (x+y)*h/2;
        }else {
            result = (x+y)*(h-1)/2+x;
        }
        System.out.print(result);

    }

}
