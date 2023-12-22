import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long a, b, d;
        for (long i = 1; i <= 3500; i++) {
            for (long j = 1; j <= 3500; j++) {
                a=4*i*j-N*i-N*j;
                if (a<=0) continue;
                b=N*i*j;
                d = gcd(a,b);
                a/=d;
                b/=d;
                if (a==1) {
                    System.out.println(i + " " + j + " " + b);
                    return;
                }
//                long k = lcm(lcm(i, j), N);
//                long a = k/i;
//                long b = k/j;
//                long c = k/N;
//                if ((a+b+1) == (4*c)) {
//                    System.out.println(i + " " + j + " " + k);
//                    return;
//                }
            }
        }
    }

    private static long gcd(long a, long b) {
        while (b > 0) {
            long temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }


    private static long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }
}