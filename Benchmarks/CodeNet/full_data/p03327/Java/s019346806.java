import java.util.*;
// import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      int n = scanner.nextInt();
      String ans = solve(n);
      System.out.println(ans);
    } finally {
      scanner.close();
    }
  }
  
  private static String solve(int n) {
    if (n <= 999) return "ABC";
    return "ABD";
  }
}
