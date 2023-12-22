import java.util.*;
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int lastRank = sc.nextInt();
      int lastScore = sc.nextInt();
      for ( int i = 1; i < n; i++ ) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ( a > lastRank ) {
           lastRank = a;
           lastScore = b;
        }
      }
      System.out.println(a+b);
  }
}