import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    new Main();
  }
  public Main() {
    try (Scanner sc = new Scanner(System.in)) {
      String S = sc.next();
      StringBuilder rev = new StringBuilder();
      for (int i = S.length() - 1;i >= 0;-- i) {
        rev.append(S.charAt(i));
        switch(rev.toString()) {
          case "maerd":
          case "remaerd":
          case "esare":
          case "resare":
            rev.delete(0, rev.length());
        }
        if (rev.length() >= 8) break;
      }
      System.out.println(rev.length() == 0 ? "YES" : "NO");
    }
  }
}
