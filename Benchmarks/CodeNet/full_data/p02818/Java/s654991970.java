import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long K = sc.nextLong();
    if(K <= A) {
      System.out.print(A-K + " " + B);
    } else if (K > A && K <= A + B) {
      System.out.print(0 + " " + (B - (K - A)));
    } else if (K >= A + B) {
      System.out.print(0 + " " + 0);
    }
  }
}