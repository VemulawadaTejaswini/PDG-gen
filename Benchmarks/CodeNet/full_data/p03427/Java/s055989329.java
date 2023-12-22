import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        if (N <= 9) {
            System.out.println(N);
            return;
        }

        long curr = 9;
        int res = 9;
        while (curr < N) {
            curr = curr * 10 + 9;
            res += 9;
        }

        if (curr == N) {
            System.out.println(res);
            return;
        }

        int len = res / 9;
        long n = N;
        while(len-- > 1) {
            n /= 10;
        }

        System.out.println(res - (10 - n));
    }
}
