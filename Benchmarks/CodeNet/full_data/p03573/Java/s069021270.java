import java.util.*

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int A = in.nextInt();
    int B = in.nextInt();
    int C = in.nextInt();
    
    if (A == B) {
      System.out.println(C);
    } else if (A == C) {
      System.out.println(B);
    } else {
      System.out.println(A);
    }
  }
}