import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final StringBuilder S1 = new StringBuilder(sc.next());
        final int N = S1.length();
        final StringBuilder S2 = new StringBuilder(S1.substring(0, (N-1) / 2));
        final StringBuilder S3 = new StringBuilder(S1.substring((N+3)/2 - 1, N));

        final boolean cond1 = S1.toString().equals(S1.reverse().toString());
        final boolean cond2 = S2.toString().equals(S2.reverse().toString());
        final boolean cond3 = S3.toString().equals(S3.reverse().toString());

        if (cond1 && cond2 && cond3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
