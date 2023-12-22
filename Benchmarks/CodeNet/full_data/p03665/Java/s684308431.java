import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(sc.next());
        int P = Integer.parseInt(sc.next());
        int[] A = new int[N];
        int odd = 0;
        int even = 0;
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(sc.next());
            if (A[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        sc.close();

        long num = getOdd(odd, P) * getEven(even);

        out.printf("%d\n", num);
        out.flush();
    }
    public static long getOdd(int odd, int P) {
        long sum = 0;
        for (int i = P; i <= odd; i+= 2) {
            sum += combination(odd, i);
        }
        return sum;
    }
    public static long getEven(int even) {
        long sum = 0;
        for (int i = 0; i <= even; i++) {
            sum += combination(even, i);
        }
        return sum;
    }
    public static long permutation(long n, long a) {
        long ans = 1;
        long count = 0;
        while(count < a) {
            ans *= (n - count);
            count++;
        }
        return ans;
    }
    public static long combination(long n, long a) {
        long choice = Math.min(a, n - a);
        return permutation(n, choice) / flatorial(choice);
    }
    public static long flatorial(long n) {
        return  permutation(n, n);
    }
}
