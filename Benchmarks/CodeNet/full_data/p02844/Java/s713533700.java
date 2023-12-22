import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      int cnt = 0;
      for(char i = '0'; i <= '9'; i++) {
        for(char j = '0'; j <= '9'; j++) {
          for(char k = '0'; k <= '9'; k++) {
              StringBuilder sb = new StringBuilder();
              sb.append(i); sb.append(j); sb.append(k);
            if(isValid(s, sb.toString()))
              cnt++;
          }
        }
      }
      System.out.println(cnt);
  }
  private static boolean isValid(String s, String t) {
    for(int i = 0, j = 0; i < s.length() && j < t.length(); i++) {
      if(t.charAt(j) == s.charAt(i)) {
        j++;
        if(j == t.length())
          return true;
      }
    }

    return false;
  }
}