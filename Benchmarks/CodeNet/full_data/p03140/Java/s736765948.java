import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    String A = sc.next();
    String B = sc.next();
    String C = sc.next();

    int ans = 0;

    for (int i = 0; i < N; i++) {
      char ai = A.charAt(i);
      char bi = B.charAt(i);
      char ci = C.charAt(i);

      if (ai != bi && bi != ci && ci != ai) {
        ans += 2;
      } else if (ai == bi && bi == ci && ci == ai) {
        ans += 0;
      } else {
        ans += 1;
      }
    }

    System.out.println(ans);

  }
}