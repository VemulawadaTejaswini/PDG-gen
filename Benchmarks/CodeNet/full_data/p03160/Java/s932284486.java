import java.util.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  int N;
  List<Integer> floor;

  void run() {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt() - 1;
    floor = new ArrayList<>();

    for (int i=0; i<=N; i++) {
      floor.add(sc.nextInt());
    }

    System.out.println(solve(0, 0l));
  }

  long solve(int n, long cost) {
    if (n == N) {
      return 0;
    }
    long jump1 = Math.abs(floor.get(n) - floor.get(n+1)) + solve(n+1, cost);
    if ((n + 1) == N) {
      return jump1;
    }
    long jump2 = Math.abs(floor.get(n) - floor.get(n+2)) + solve(n+2, cost);
    return Math.min(jump1, jump2);
  }
}
