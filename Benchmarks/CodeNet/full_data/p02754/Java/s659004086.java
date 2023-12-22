import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        final long A = sc.nextLong();
        final long B = sc.nextLong();

        long ans = N % (A+B) * A;
        long rem = N % (A + B);
        ans += Math.min(rem, A);
        System.out.println(ans);
    }
}