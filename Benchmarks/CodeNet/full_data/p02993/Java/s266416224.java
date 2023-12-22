import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    System.out.println((S.charAt(0) != S.charAt(1) && S.charAt(1) != S.charAt(2) && S.charAt(2) != S.charAt(3)) ? "Good" : "Bad");
  }
}