import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String O = sc.next();
    String E = sc.next();
    StringBuilder A = new StringBuilder();
    System.out.println(A);
    for (int i = 0; i < E.length(); i++) {
      A.append(O.charAt(i));
      A.append(E.charAt(i));
    }
    if (O.length() > E.length()) {
      A.append(O.charAt(O.length() - 1));
    }
    System.out.println(A);
  }
}
