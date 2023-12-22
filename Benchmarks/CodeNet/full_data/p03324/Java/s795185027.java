import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int d  = sc.nextInt();
    int n = sc.nextInt();
    if(d == 0) {
      System.out.println(n);
      return;
    }
    System.out.println(Math.pow(100, d) * n);
  }
}