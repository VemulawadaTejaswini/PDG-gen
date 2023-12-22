import java.io.IOException;
import java.util.Scanner;
 
public class Main {
  /**
   * Main method.
   */
  public static void main(String[] args) throws IOException {
    Scanner s = new Scanner(System.in);
    
    final int A = s.nextInt();
    final int B = s.nextInt();
    final int C = s.nextInt();
    final int D = s.nextInt();
    
    int train = Math.min(A, B);
    int bas = Math.min(C, D);
    
    System.out.println(train + bas);
 
  }
}