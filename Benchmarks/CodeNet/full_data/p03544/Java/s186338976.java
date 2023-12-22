import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long ans = 0;
        if (N == 0) ans = 2;
        else if (N == 1) ans = 1;
        else {
            long p2 = 2;
            long p1 = 1;
            long cur = 0;
            for (long i = 2; i <= N; i++) {
                cur = p1 + p2;
                p2 = p1;
                p1 = cur;
            }
            ans = cur;
        }
        System.out.println(ans);

        return;
    }

}