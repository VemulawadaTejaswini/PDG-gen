import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String S = scanner.nextLine();
    scanner.close();
    if (S.equals("AAA") || S.equals("BBB")) {
        System.out.println("No");
    } else {
        System.out.println("Yes");
    }
  }
}