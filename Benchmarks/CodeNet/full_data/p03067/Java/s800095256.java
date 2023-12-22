import java.util.*;
// import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      System.out.println(query(a,b,c));
    } finally {
      sc.close();
    }
  }

  private static String query(int a, int b, int c) {
    if (a < c && c < b) return "Yes";
    if (b < c && c < a) return "Yes";
    return "No";
  }
}
