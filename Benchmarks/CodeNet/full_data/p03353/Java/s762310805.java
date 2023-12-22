import java.io.PrintWriter;
import java.util.*;


public class TestClass {

  private static final Scanner in = new Scanner(System.in);
  private static final PrintWriter out = new PrintWriter(System.out);
  static List<String> list = new ArrayList<>();

  private static int[] nextArray(int n) {
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    return arr;
  }

  public static void main(String[] args) {
    String s = in.next();
    int k = in.nextInt();
    solve(s);
    if (list.size() < k) {
      out.println(list.get(list.size() - 1));
    } else {
      out.println(list.get(k - 1));
    }
    out.flush();
    out.close();
  }

  private static void solve(String str) {
    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j <= str.length(); j++) {
        list.add(str.substring(i, j));
      }
    }
    list = new ArrayList<>(new HashSet<>(list));
    Collections.sort(list);
  }
}
