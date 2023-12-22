import java.util.*;

public class Main
{
  public static Scanner sc = new Scanner(System.in);

  public static int n;

  public static int dfs(String s) {
    if (Integer.parseInt(s) > n) {
      return 0;
    }

    int ans = 0;
    if (s.contains("7") && s.contains("5") && s.contains("3")) {
      ans = 1;
    }

    ans += dfs(s + "7");
    ans += dfs(s + "5");
    ans += dfs(s + "3");

    return ans;
  }

  public static void main(String args[])
  {
    n = Integer.parseInt(sc.next());

    System.out.println(dfs("0"));
  }
}