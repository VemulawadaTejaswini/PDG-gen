import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    int win = 0;
    for (int i = 0; i < s.length() - 1; i++) {
      if (s.charAt(i) == 'o') {
        win++;
      }
    }
    
    int remain = 15 - s.length();
    
    if (remain >= (8 - win)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}