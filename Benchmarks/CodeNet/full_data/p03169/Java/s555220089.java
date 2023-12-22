import java.util.*;

public class Main {
    private static double solve(int N, int[] a) {
        int[] state = new int[4];
        for (int i = 0; i < N; i++)
            state[a[i]] += 1;

        return solve(N, state, new double[301][301][301]);
    }

    private static double solve(int N, int[] state, double[][][] memo){
        double e = memo[state[1]][state[2]][state[3]];
        if (e > 0) return e;

        for (int s = 1; s <= 3; s++){
            if (state[s] == 0) continue;

            double p = (double)state[s]/N;
            double q = (double)state[0]/N;

            state[s] -= 1;
            state[s-1] += 1;
            e += (p/(1.0-q))*(solve(N, state, memo) + 1.0 / (1.0 - q));
            state[s-1] -= 1;
            state[s] += 1;
        }

        memo[state[1]][state[2]][state[3]] = e;
        
        return e;
    }

    public static double run(Scanner scanner) {
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i=0; i < N; i++) a[i] = scanner.nextInt();

        return solve(N, a);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(run(scanner));
        }
        //Tests.run();
    }
}