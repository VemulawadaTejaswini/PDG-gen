import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Long> A = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            A.add(sc.nextLong());
        }

        for (int i = 1; i < N-1; i++) {
            A.set(0, gcd(A.get(0), A.get(i)));
        }

        System.out.println(A.get(0));
    }

    private static long gcd(long x, long y) {
        if (x > y) {
            long tmp = x;
            x = y;
            y = tmp;
        }
        while (true) {
            long rem = x % y;
            if (rem == 0) {
                return y;
            }
            x = y;
            y = rem;
        }
    }
}
