import java.util.*;
import java.util.function.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    String T = sc.next();
    sc.close();

    StringBuilder buf = new StringBuilder();
    for (int i = 0; i < N; i++) {
      buf.append(S.charAt(i));
      buf.append(T.charAt(i));
    }
    System.out.println(buf);
  }
}