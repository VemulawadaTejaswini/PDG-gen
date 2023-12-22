import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class TestClass {

  private static final Scanner in = new Scanner(System.in);
  private static final PrintWriter out = new PrintWriter(System.out);
  private static final Set<String> set = new TreeSet<>();

  private static long[] nextArray(int n) {
    long[] arr = new long[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextLong();
    }
    return arr;
  }

  public static void main(String[] args) {
    String s = in.next();
    int k = in.nextInt();
    solve(s,k);
    int i = 0;
    for (String string : set){
      if (i == k - 1){
        out.println(string);
      }
      i++;
    }
    out.flush();
    out.close();
  }

  private static void solve(String str, int k) {
    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j <= str.length(); j++) {
        if (str.substring(i, j).length() <= k) {
          set.add(str.substring(i, j));
        }
      }
    }
  }


}