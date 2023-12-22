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

        int sum = 0;
        int[] T = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            T[i] = sc.nextInt();
            sum += T[i];
        }

        int M = sc.nextInt();
        int[] P = new int[M];
        int[] X = new int[M];
        for (int i = 0; i < M; i++) {
            P[i] = sc.nextInt();
            X[i] = sc.nextInt();

            System.out.println(sum - T[P[i]] + X[i]);
        }
        

        return;
    }

}