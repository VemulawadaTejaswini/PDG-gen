import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int ans1 = -1;
    int ans2 = -1;
    for(int i = 0; i < s.length() - 1; i++) {
      if(s.charAt(i) == s.charAt(i + 1)) {
        ans1 = (i + 1);
        ans2 = (i + 2);
      }
    }
    for(int i = 0; i < s.length() - 2; i++) {
      if(s.charAt(i) == s.charAt(i + 2)) {
        ans1 = (i + 1);
        ans2 = (i + 3);
      }
    }
    System.out.println(ans1 + " " + ans2);
  }
}