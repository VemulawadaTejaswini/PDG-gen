import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Comparator;
import java.util.Collections;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    CPoll solver = new CPoll();
    solver.solve(1, in, out);
    out.close();
  }

  static class CPoll {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      HashMap<String, Integer> mp = new HashMap<>();
      int n = in.nextInt();
      int max = 0;
      List<String> ans = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        String s = in.next();
        mp.merge(s, 1, Integer::sum);
      }
      for (int i : mp.values()) {
        max = Math.max(max, i);
      }
      List<String> l = new ArrayList<>();
      for (Map.Entry<String, Integer> e : mp.entrySet()) {
        if (e.getValue() == max) {
          ans.add(e.getKey());
        }
      }
      Collections.sort(ans, Comparator.naturalOrder());
      StringBuffer sb = new StringBuffer();
      for (String s : ans) {
        sb.append(s);
        sb.append("\n");
      }
      out.println(new String(sb));

    }

  }
}

