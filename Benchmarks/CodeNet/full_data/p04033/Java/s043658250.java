import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    if (A == 0 || B == 0 || (A < 0 && B > 0)) {
      System.out.println("Zero");
    } else if ((A > 0 && B > 0) || ((B-A+1)%2 == 0) {
      System.out.println("Positive");              
    } else {
      System.out.println("Negative");
    }
  }
}