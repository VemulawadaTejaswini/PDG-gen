import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        if(b>a) {
            long c = a;
            a = b;
            b = c;
        }
        long gcd = gcd(a, b);
        long pfCount = 1; // 1を含む、gcdの素因数の重複除去個数
        long current = gcd;
        long i=2;
        if(current%i==0) {
            current /= i;
            pfCount++;
            while(current%i==0) {
                current /= i;
            }
        }
        i++;
        while(i<=current) {
            if(current%i==0) {
                current /= i;
                pfCount++;
                while(current%i==0) {
                    current /= i;
                }
            }
            i+=2;
        }

        if(false) {
            System.out.println(gcd);
        }

        System.out.println(pfCount);
    }
    private static long gcd(long a, long b) {
        if(b==0) {
            return a;
        }
        return gcd(b, a%b);
    }
}
