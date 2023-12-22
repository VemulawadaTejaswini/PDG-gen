import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int K = sc.nextInt();
    
    for (int i = 0; i < K; i++) {
      if (A == 0) {
        A--;
      } else {
        B--;
      }
    }
    System.out.print(A + " " + B);
  }
}