import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        long cnt = 0;
        if (N == 1 && M == 1) {
            cnt = 1;
            System.out.println(cnt);
        } else if (N == 1) {
            cnt = M - 2;
            System.out.println(cnt);
        } else if (M == 1) {
            cnt = N - 2;
            System.out.println(cnt);
        } else {
            BigInteger v = new BigInteger(String.valueOf(N - 2), 10).multiply(new BigInteger(String.valueOf(M - 2), 10));
            System.out.println(v.toString());
        }

        return;
    }

}