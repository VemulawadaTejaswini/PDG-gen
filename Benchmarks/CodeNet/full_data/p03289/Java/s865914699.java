import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      String s = scanner.next();
      String pattern = "^A[a-z]+C[a-z]+$";
      if (s.matches(pattern)) {
        System.out.println("AC");
      } else {
        System.out.println("WA");
      }
    } finally {
      scanner.close();
    }
  }
}
