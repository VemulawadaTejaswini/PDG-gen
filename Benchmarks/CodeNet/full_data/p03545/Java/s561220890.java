import java.util.*;
public class Main {
  static String ans;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ans = "";
    String str = sc.next();
    int a = str.charAt(0) - '0';
    int b = str.charAt(1) - '0';
    int c = str.charAt(2) - '0';
    int d = str.charAt(3) - '0';
    dfs(str, 0, 0, new StringBuilder());
    System.out.println(ans.substring(0, ans.length() - 1 ) + "=7");
  }
  public static void dfs(String str, int index, int sum, StringBuilder sb) {
    if (!ans.isEmpty()) return;
    if (sum == 7 && str.length() == index) {
      ans = sb.toString();
      return;
    }
    if (str.length() == index) return;
    int num = str.charAt(index) - '0';
    sb.append(num);
    sb.append("+");
    dfs(str, index + 1, sum + num, sb);
    sb.setLength(sb.length() - 1);
    sb.append("-");
    dfs(str, index + 1, sum - num, sb);
    sb.setLength(sb.length() - 2);
  }
}
