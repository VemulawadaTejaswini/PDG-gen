import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long c = a(a, b);
        int res = 1;
        for(long i=2; i*i <= c; i++) {
            boolean d = false;
            while(c % i == 0) {
                c /= i;
                d = true;
            }
            if(d) res++;
        }
        if(c > 1) res ++;
        System.out.println(res);
    }

    public static long a(long a, long b) {
        if(a==b) return a;
        if(b > a) {
            return a(b, a);
        }
        if(a % b == 0) {
            return b;
        }
        return a(b, a%b);
    }
}
