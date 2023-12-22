import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      double d = 1e-10;
      int N = in.nextInt();
      int K = in.nextInt();
      double prob = N >= K ? (N - K + 1) / (double)N : 0;
      

      for (int i = 1; i < K; ++i) {
        int point = i;
        int throw = 1;

        while (point * 1 << throw < K) {
          throw << 1;
        }
        
        prob += (1 / (double)N) * (1 / (double)throw) + d;
      }

      System.out.printf("%.9d\n",prob);
    }
  }
}