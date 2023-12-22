import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    long[] ans = new long[n+1];
    ans[0] = 2;
    ans[1] = 1;
    for(int i=2; i<=n; i++) {
      ans[i] = ans[i-2] + ans[i-1];
    }
    System.out.println(ans[n]);
  }
}
