package abc142.d;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        long A = scan.nextLong();
        long B = scan.nextLong();

        if(A > B) {
            long tmp = A;
            A = B;
            B = tmp;
        }
        long gcd = gcd(A, B);
        if(gcd == 1) {
            os.println("1");
        } else {
            long x = gcd;
            long previ = 0;
            long answer = 1;

            if(x%2 == 0)
                answer++;

            while(x%2 == 0) {
                x /= 2;
            }

            for (long i = 3 ; i <= Math.sqrt(x); i += 2) {
                if (x % i == 0)
                    answer++;
                while(x%i == 0) {
                    x /= i;
                }
            }

            if(x > 2)
                answer++;

            os.println(answer);

        }

    }



    static public long gcd(long a, long b) {
        while(a > 0) {
            long tmpa = a;
            a = b % a;
            b = tmpa;
        }
        return b;
    }

}