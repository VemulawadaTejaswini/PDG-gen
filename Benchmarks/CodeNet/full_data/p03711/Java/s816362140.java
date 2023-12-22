import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = "0121313113131";
    int a = sc.nextInt();
    int b = sc.nextInt();
    boolean ans = s.charAt(a) == s.charAt(b);
    System.out.println(ans ? "Yes" : "No");
  }
}