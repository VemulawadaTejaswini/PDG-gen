import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    sc.close();

    String ans = "No";
    if (N % 2 == 0) {
      String s = S.substring(0, N / 2);
      if (S.equals(s + s)) ans = "Yes";
    }
    System.out.println(ans);
  }
}