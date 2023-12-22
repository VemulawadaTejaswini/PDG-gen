import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        if(c<d) {
            long tmp = c;
            c = d;
            d = tmp;
        }

        long cc = c;
        long cd = d;

        long x = c*d;
        long r = c%d;
        while(r!=0) {
            c = d;
            d = r;
            r = c%d;
        }

        x = x/d;


        long l = b/cc + b/cd - b/x;
        long s = (a-1)/cc + (a-1)/cd - (a-1)/x;
        //System.out.println(l +" "+ s);
        System.out.println(b-(a-1)-(l-s));

    }
}