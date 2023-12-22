import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner (System.in);
    
    while (in.hasNext()) {
      int N = in.nextInt();
      int A = in.nextInt();
      int B = in.nextInt();
      
      System.out.println(Math.min(N * A, B));
    }
  }
}