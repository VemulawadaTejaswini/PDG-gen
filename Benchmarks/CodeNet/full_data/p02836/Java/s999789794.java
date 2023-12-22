import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int count = 0;
    
    for (int i = 0; i < S.length() / 2; i++) {
      int a = S.charAt(i);
      int b = S.charAt(S.length()-i-1);
      if (a != b) {
        count++;
      }
      System.out.print(count);
    }
  }
}