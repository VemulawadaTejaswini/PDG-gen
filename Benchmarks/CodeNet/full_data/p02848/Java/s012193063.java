import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    sc.close();

    char[] ans = new char[S.length()];
    for (int i = 0; i < S.length(); i++) {
      int c = (int) S.charAt(i) - 'A';
      c = (c + N)  % 26;
      ans[i] = (char) ('A' + c);
    }
    System.out.println(new String(ans));
  }
}