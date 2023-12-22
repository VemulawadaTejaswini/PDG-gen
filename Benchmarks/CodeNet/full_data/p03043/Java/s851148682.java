import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int N = scn.nextInt();
    int K = scn.nextInt();

    double winRate = 0;
    for (int i = 1; i <= N; i++) {
      winRate += calcProb(i, K, 1.0 / N);

    }
    System.out.println(winRate);
  }

  public static double calcProb(int N, int K, double prob) {

    if (N >= K) {
      return prob;

    } else {
      return calcProb(N * 2, K, prob * 0.5);

    }
  }
}