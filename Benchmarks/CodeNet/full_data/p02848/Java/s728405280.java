import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    
    for (int i = 0; i < S.length; i++) {
      s[i] = (char)((s[i] - 'A' + n) % 26 + 'A');
    }
    System.out.print(String.valueOf(s));
  }
}