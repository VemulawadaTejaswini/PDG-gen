import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char c1 = str.charAt(0);
    char c2 = str.charAt(str.length() - 1);
    System.out.println("" + c1 + (str.length() - 2) + c2);
  }
}
