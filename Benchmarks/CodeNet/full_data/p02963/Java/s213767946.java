import java.util.*;

public class Main {
  
  private static final long INT10_9 = 1_000_000_000;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long S = sc.nextLong();
    
    long start = S / INT10_9;
    for (long i = start; i <= INT10_9; i++) {
      long x = (long) INT10_9 * i - S;
      if (0 <= x && x <= INT10_9) {
        // found
        System.out.println("0 0 " + INT10_9 + " 1 " + x + " " + i);
      }
    }
  }
}