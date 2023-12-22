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
        long length = 0;
        if (X * 2 >= N) {
            length = 3 * X;
        } else if (X * 2 >= N - X) {
            length += N;
            length += X * 2;
            length += X * 4 - N;
        } else {
            length += N;
            length += (N - X) * 2 - X;
        }
        System.out.println(length);
    }
}