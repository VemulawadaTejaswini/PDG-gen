import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    try {
      String S = scanner.next();
      String T = scanner.next();
      int n = S.length();
      
      for (int i = 0; i < n; i++) {
        if (valid(S,T,n,i)) {
          System.out.println("Yes");
          return;
        }
      }
      System.out.println("No");
    }
    finally {
      scanner.close();
    }
  }

  private static boolean valid(String s, String t, int n, int offset) {
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) != t.charAt((i+offset)%n)) return false;
    }
    return true;
  }
}