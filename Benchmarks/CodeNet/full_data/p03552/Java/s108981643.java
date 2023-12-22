import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 public class arc085d {

 }

 */
public class Main {
  public void solve() throws FileNotFoundException {
    InputStream inputStream = System.in;

    InputHelper in = new InputHelper(inputStream);

    // actual solution
    int n = in.readInteger();
    int z = in.readInteger();
    int w = in.readInteger();

    n += 2;
    
    int[] a = new int[n];

    a[0] = z;
    a[1] = w;

    for (int i = 2; i < n; i++) {
      a[i] = in.readInteger();
    }

    int[][] dpmin = new int[n][n];

    int[][] dpmax = new int[n][n];

    int[] max = new int[n];
    int[] min = new int[n];

    for (int i = 0; i < n - 2; i++) {
      dpmax[i][n - 1] = Math.abs(a[n - 1] - a[n - 2]);
      dpmin[i][n - 1] = Math.abs(a[n - 1] - a[n - 2]);
      max[i] = dpmax[i][n - 1];
      min[i] = dpmin[i][n - 1];
    }

    for (int i = n - 2; i >= 2; i--) {
      for (int j = 0; j < i - 1; j++) {
        dpmax[j][i] = Math.max(max[i - 1], Math.abs(a[i - 1] - a[n - 1]));
      }
      for (int j = 0; j < i - 1; j++) {
        dpmin[j][i] = Math.min(min[i - 1], Math.abs(a[i - 1] - a[n - 1]));
      }

      for (int j = 0; j < i - 1; j++) {
        max[j] = Math.max(max[j], dpmin[j][i]);
        min[j] = Math.min(min[j], dpmax[j][i]);
      }
    }

    System.out.println(dpmax[0][2]);
    // end here
  }

  public static void main(String[] args) throws FileNotFoundException {
    (new Main()).solve();
  }

  class InputHelper {
    StringTokenizer tokenizer = null;
    private BufferedReader bufferedReader;

    public InputHelper(InputStream inputStream) {
      InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
      bufferedReader = new BufferedReader(inputStreamReader, 16384);
    }

    public String read() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          String line = bufferedReader.readLine();
          if (line == null) {
            return null;
          }
          tokenizer = new StringTokenizer(line);
        } catch (IOException e) {
          e.printStackTrace();
        }
      }

      return tokenizer.nextToken();
    }

    public Integer readInteger() {
      return Integer.parseInt(read());
    }

    public Long readLong() {
      return Long.parseLong(read());
    }
  }
}
