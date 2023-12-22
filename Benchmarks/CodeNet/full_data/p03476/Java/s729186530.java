import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for (int q = 0; q < Q; q++) {
            int L = in.nextInt();
            int R = in.nextInt();

            int res = 0;
            for (int n = L; n < R + 1; n += 2) {
                if (isPrime(n) && isPrime((n + 1) / 2)) {
                    res++;
                }
            }

            System.out.println(res);
        }
    }

    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

