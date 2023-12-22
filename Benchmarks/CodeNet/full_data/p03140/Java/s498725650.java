import java.util*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String A = sc.next();
    String B = sc.next();
    String C = sc.next();
    int ans = 0;
    for (int i = 0; i < N; i++) {
      char a = A.charAt(i);
      char b = B.charAt(i);
      char c = C.charAt(i);
      if (a == b && b == c) {
        ;
      } else if (a == b || b == c || c == a) {
        ans += 1;
      } else {
        ans += 2;
      }
    }
    System.out.println(ans);
  }
}