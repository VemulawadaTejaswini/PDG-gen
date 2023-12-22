import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        final long A = sc.nextLong();
        final long B = sc.nextLong();

        int total = 0;
        while (N > 0) {
            if (N >= A) {
                N -= A;
                total += A;
            } else {
                total += N;
                N = 0;
            }
            N -= B;
        }
        System.out.println(total);
    }
}
