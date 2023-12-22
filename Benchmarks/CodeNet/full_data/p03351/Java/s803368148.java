import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
    System.out.println((Math.abs(a - c) <= d || Math.abs(a - b) <= d && Math.abs(b - c) <= d) ? "Yes" : "No");
  }
}