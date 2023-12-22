import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
  static final long MOD = 1000000007;
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line = br.readLine().split(" ");
    int n = Integer.parseInt(line[0]);
    int k = Integer.parseInt(line[1]);
    long[] max_n = new long[n + 2];
    long[] min_n = new long[n + 2];
    for(int i = 1; i <= n; i++){
      max_n[i] = max_n[i - 1] + (n + 1 - i);
      min_n[i] = min_n[i - 1] + (i - 1);
    }
    long answer = 0;
    for(int i = k; i <= n + 1; i++){
      answer += max_n[i] - min_n[i] + 1;
      answer = (answer + MOD) % MOD;
    }
    System.out.println(answer);
  }
}
