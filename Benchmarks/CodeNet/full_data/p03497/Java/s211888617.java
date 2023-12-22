import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 public class arc086b {

 }

 */
public class Main {
  public void solve() throws FileNotFoundException {
    InputStream inputStream = System.in;

    InputHelper in = new InputHelper(inputStream);

    // actual solution
    int n = in.readInteger();

    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = in.readInteger();
    }

    int lm = -1;
    Boolean isp = null;
    int lmi = -1;

    for (int i = 0; i < n; i++) {
      int abs = Math.abs(a[i]);

      if (abs > lm) {
        lm = abs;
        lmi = i;
        if (a[i] < 0) {
          isp = false;
        }
        if (a[i] >= 0) {
          isp = true;
        }
      } else if (abs == lm) {
        if (a[i] >= 0 && (isp == null || isp == false)) {
          lmi = i;
          isp = true;
        }
      }
    }

    if (lm <= 0) {
      System.out.println("0");
      return;
    }

    System.out.println(2 * n);
    if (isp) {
      System.out.println(lmi + 1 + " " + 1);
      System.out.println(lmi + 1 + " " + 1);

      for (int i = 2; i <= n; i++) {
        System.out.println(i - 1 + " " + i);
        System.out.println(i - 1 + " " + i);
      }
    } else {
      System.out.println(lmi + 1 + " " + n);
      System.out.println(lmi + 1 + " " + n);

      for (int i = n - 1; i >= 1; i--) {
        System.out.println(i + 1 + " " + i);
        System.out.println(i + 1 + " " + i);
      }
    }
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
