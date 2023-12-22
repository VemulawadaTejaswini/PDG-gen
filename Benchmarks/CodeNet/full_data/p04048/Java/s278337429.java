import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    static void solve(Scanner in) {
        long N = in.nextLong();
        long X = in.nextLong();
        long length = N;
        length += rec(X, N - X);
        System.out.println(length);
    }

    static long rec(long A, long B) {
        long D = B;
        long ret = 0;
        while (D > A) {
            ret += A * 2;
            D -= A;
        }
        if (D == A)
            return ret + A;
        else
            return ret + rec(D, A);
    }
}