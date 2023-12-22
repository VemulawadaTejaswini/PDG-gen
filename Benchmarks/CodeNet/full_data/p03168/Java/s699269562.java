import java.util.*;

public class Main {
    private static double solve(int N, double[] p) {
        double[] hCount = new double[N+1];
        hCount[0] = 1.0;
        for (int i = 0; i < N; i++)
            for (int j = i+1; j >=0; j--)
                hCount[j] = ((j >= 1) ? p[i]*hCount[j-1]: 0) + (1.0-p[i])*hCount[j];
        double sum = 0.0;
        for (int i = N/2+1; i <= N; i++) sum += hCount[i];
        return sum;
    }

    public static double run(Scanner scanner) {
        int N = scanner.nextInt();
        double[] p = new double[N];
        for (int i=0; i < N; i++) p[i] = scanner.nextDouble();

        return solve(N, p);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(run(scanner));
        }
        //Tests.run();
    }
}
