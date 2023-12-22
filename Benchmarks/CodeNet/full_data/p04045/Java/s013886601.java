import java.io.*;
import java.util.*;

public class Main {
  static int MOD = 1000000007;
  static double EPS = 1e-9;

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(in.readLine());

    String N = st.nextToken();
    int length = N.length();
    int K = Integer.parseInt(st.nextToken());

    TreeSet<Integer> set = new TreeSet<Integer>();

    st = new StringTokenizer(in.readLine());

    for (int i = 0; i < K; i++) {
      set.add(Integer.parseInt(st.nextToken()));
    }

    int[] valid = new int[10 - K];
    int index = 0;

    for (int i = 0; i < 10; i++) {
      if (!set.contains(i)) {
        valid[index] = i;
        index++;
      }
    }

    // System.out.println(Arrays.toString(valid));

    int res = 0;

    boolean b = true;
    boolean large = false;

    for (int i = 0; i < length; i++) {
      int d = N.charAt(i) - '0';
      // System.out.println(d);
      boolean done = false;
      if (large) {
        res = res * 10 + valid[0];
        continue;
      }
      for (int j = 0; j < valid.length; j++) {
        if (valid[j] >= d) {
          if (i == 0 && valid[j] > d)
            large = true;
          res = res * 10 + valid[j];
          done = true;
          break;
        }
      }
      if (!done) {
        b = false;
        break;
      }
    }

    if (!b) {
      res = valid[valid.length - 1];
      for (int i = 0; i < length - 1; i++) {
        res = res * 10 + valid[0];
      }
    }

    System.out.println(res);

    in.close();
  }
}