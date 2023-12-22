import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();

    int N = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());

    int[] h = new int[N];

    for (int i = 0; i < N; i++) {
      h[i] = Integer.parseInt(sc.next());
    }
    int ans = (int) 10e9;
    Arrays.sort(h);
    for (int j = 0; j <= N - K; j++) {
      if (h[j + K - 1] - h[j] < ans)
        ans = h[j + K - 1] - h[j];
    }

    System.out.println(ans);
  }
}