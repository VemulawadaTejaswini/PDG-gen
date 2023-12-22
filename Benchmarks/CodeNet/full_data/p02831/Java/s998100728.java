import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int a = A;
    int b = B;
    
    while (a != 1) {
      if (a == b) {
        System.out.print(a);
        break;
      } else if (a < b) {
        a += A;
      } else if (a > b) {
        b += B;
      }
    }
  }
}