import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  private void solve(Scanner in, PrintWriter out) {
    int N = in.nextInt();
    int[] primes = getPrimes(N + 1);

    TreeMap<Integer, Integer> count = new TreeMap<>();
    for (int n = 1; n <= N; n++) {
      int x = n;
      for (int prime : primes) {
        while (x % prime == 0) {
          Integer c = count.get(prime);
          if (c == null)
            count.put(prime, 1);
          else
            count.put(prime, c + 1);
          x /= prime;
        }
        if (x == 1) break;
      }
    }

    int MOD = (int) (1e9 + 7);
    long ans = 1;
    for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
      ans *= (entry.getValue() + 1);
      ans %= MOD;
    }
    out.println(ans);
  }

  public static int[] getPrimes(int N) {
    ArrayList<Integer> primes = new ArrayList<>();
    boolean[] isComposite = new boolean[N + 1];
    primes.add(2);
    for (int i = 3; i <= N; i += 2)
      if (!isComposite[i]) {
        primes.add(i);
        for (int j = i * 2; j <= N; j += i) {
          isComposite[j] = true;
        }
      }
    int[] array = new int[primes.size()];
    for (int i = 0; i < primes.size(); i++) {
      array[i] = primes.get(i);
    }
    return array;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(in, out);
    in.close();
    out.close();
  }
}
