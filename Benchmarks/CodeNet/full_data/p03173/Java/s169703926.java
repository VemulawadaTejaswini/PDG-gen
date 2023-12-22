import java.util.*;

public class Main {
    private static long solve(int N, int[] a) {
      long[][] sum = new long[N][N];
      long[][] cost = new long[N][N];
      
      for (int e = 0; e < N; e++)
        for (int s = e; s >= 0; s--){
          sum[s][e] = e > 0 ? sum[s][e-1]+a[e]: a[e];
          cost[s][e] = e == s ? 0: Long.MAX_VALUE;
          for (int m = s; m < e; m++){
            long c = sum[s][m]+sum[m+1][e]
              +cost[s][m]+cost[m+1][e];
            cost[s][e] = Math.min(cost[s][e], c);
          }
        }
      
      return cost[0][N-1];
    }
  
    public static long run(Scanner scanner) {
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