import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final long N = sc.nextLong();
        final long A = sc.nextLong();
        final long B = sc.nextLong();

        if (A + B <= N) {
            System.out.println(A * (N / (A + B)) + (N % (A + B)));
        } else {
            System.out.println(A);
        }
    }
}