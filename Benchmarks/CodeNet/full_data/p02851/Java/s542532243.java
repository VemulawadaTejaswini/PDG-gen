import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(in.readLine());
    int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(in.readLine());
    int[] A = new int[N];
    for (int i = 0; i < N; ++i) {
      A[i] = Integer.parseInt(st.nextToken());
    }

    HashMap<Integer, Integer> psumCt = new HashMap<>();
    psumCt.put(0, 1);
    int[] psum = new int[N + 1];
    long ans = 0;
    for (int i = 0; i < N; ++i) {
      if (i + 1 >= K) {
        int x = psum[i + 1 - K];
        psumCt.put(x, psumCt.get(x) - 1);
      }
      psum[i + 1] = (psum[i] + A[i] - 1) % K;
      int ct = psumCt.getOrDefault(psum[i + 1], 0);
      ans += ct;
      psumCt.put(psum[i + 1], ct + 1);
    }
    out.println(ans);

    out.close();
  }
}
