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
        int T = sc.nextInt();
        int[] t = new int[N];

        for (int i = 0; i < N; i++) {
            t[i] = sc.nextInt();
        }

        if (N == 1) {
            System.out.println(T);
            return;
        }

        // simple event-driven simulation
        long sum = 0;
        for (int i = 1; i < N; i++) {
            sum += Math.min(T, t[i] - t[i - 1]);
        }
        sum += T;
        System.out.println(sum);

        return;
    }

}