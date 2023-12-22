import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    String a = in.next();
    String b = in.next();
    System.out.println(new Solver().solve(a, b, a.length(), b.length()).reverse());
  }
}

class Solver {
  public int max(int a, int b) {
    return a > b ? a : b;
  }

  public StringBuilder solve(String a, String b, int m, int n) {
    StringBuilder ans = new StringBuilder();
    if (m == 0 || n == 0) {
      return ans;
    } else if (a.charAt(m-1) == b.charAt(n-1)) {
      return ans.append(a.charAt(m-1)).append(solve(a, b, m-1, n-1));
    } else {
      StringBuilder temp1 = solve(a, b, m, n-1);
      StringBuilder temp2 = solve(a, b, m-1, n);
      if (temp1.length() > temp2.length()) {
        return temp1;
      } else {
        return temp2;
      }
    }
  }
}
