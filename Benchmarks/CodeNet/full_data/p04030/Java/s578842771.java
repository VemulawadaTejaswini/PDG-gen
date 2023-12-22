import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] s_char = sc.next().toCharArray();
    String ans = "";
    for (int i = 0; i < s_char.length; i++) {
      if (s_char[i] == '0') {
        ans += "0";
      } else if (s_char[i] == '1') {
        ans += "1";
      } else if (s_char[i] == 'B' && ans.length() > 0) {
        ans = ans.substring(0, ans.length() - 1);
      }
    }
    System.out.println(ans);
  }
}