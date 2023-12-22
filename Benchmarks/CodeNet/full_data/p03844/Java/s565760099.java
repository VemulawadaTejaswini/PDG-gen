import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String op = sc.next();
    String b = sc.next();
    long a = Long.parseLong(a);
    long b = Long.parseLong(b);
    long ans = a + b;
    if(op.equals("-")) ans = a - b;
    System.out.println(ans);
  }
}