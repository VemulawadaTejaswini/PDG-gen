import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      int n = sc.nextInt();
      String s = sc.next();
      StringBuffer sb = new StringBuffer();
      for (int i = 0; i < s.length(); i++) {
        sb.append((char)((s.charAt(i) - 'A' + n) % 26 + 'A'));
      }
      System.out.println(sb.toString());
    } finally {
      sc.close();
    }
  }
}