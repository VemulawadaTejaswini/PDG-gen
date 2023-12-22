import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 public class abc084C {

 }

 */
public class Main {
  public void solve() throws FileNotFoundException {
    InputStream inputStream = System.in;

    InputHelper in = new InputHelper(inputStream);

    // actual solution
    int n = in.readInteger();

    int[] c = new int[n];
    int[] s = new int[n];
    int[] f = new int[n];


    for (int i = 0; i < n - 1; i++) {
      c[i] = in.readInteger();
      s[i] = in.readInteger();
      f[i] = in.readInteger();
    }

    for (int i = 0; i < n - 1; i++) {
      int cv = 0;
      for (int j = i; j < n - 1; j++) {
        if (s[j] >= cv) {
          cv = s[j] + c[j];
          continue;
        } else {
          int diff = cv - s[j];
          int t = (diff + f[j] - 1) / f[j];
          cv = s[j] + t * f[j] + c[j];
        }
      }
      System.out.println(cv);
    }
    
    System.out.println(0);
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
