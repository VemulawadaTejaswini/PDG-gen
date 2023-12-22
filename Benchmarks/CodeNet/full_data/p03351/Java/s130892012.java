import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     int d = sc.nextInt();
     int deltaAB = Math.abs(a - b);
     int deltaBC = Math.abs(b - c);
     int deltaCA = Math.abs(c - a);
     if ((deltaAB <= d && deltaBC <= d) || deltaCA <= d) {
       System.out.println("Yes");
     } else {
       System.out.println("No");
     }
  }
}