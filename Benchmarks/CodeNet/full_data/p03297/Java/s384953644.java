import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        

        outer: for (int i = 0; i < t; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            
            if (a < b) {
                so.println("No");
                continue;
            }
            if (b > d) {
                so.println("No");
                continue;
            }
            if (b == d) {
                so.println((a % b <= c) ? "Yes" : "No");
                continue;
            }
            if (a % b > c) {
                so.println("No");
                continue;
            }
            
            long supAB = a % b;
            final long diffDB = d - b;
            
            for (int j = 0; j < 500000; j++) {
                long next =  f(c, supAB, diffDB);
//                so.println("c: " + c + ", i: " + i + ", sup: " + supAB + ", next: " + next);
                if (next < b) {
                    so.println("No");
                    continue outer;
                }
                if (next + d < b) {
                    so.println("No");
                    continue outer;
                }
                supAB = (next + d) % b;
//                so.println("c: " + c + ", i: " + i + ", sup: " + supAB + ", next: " + next);
//                so.println();
            }
            so.println("Yes");
        }
    }
    
    static long f(long x, long sup, long diff) {
        long temp = ((x - sup - 1) / diff + 1) * diff + sup;
        if (x == temp) temp += diff;
        return temp;
    }
}
/*
1
9 7 5 9


*/