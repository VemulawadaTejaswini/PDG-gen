import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    int N = sc.nextInt();
    switch (D) {
      case 0:
        if (N != 100) {
          System.out.println(N);
        } else {
          System.out.println(N + 1);
        }       
        break;
      case 1:
        if (N != 100) {
          System.out.println(N * 100);
        } else {
          System.out.println((N + 1) * 100);
        }       
        break;
      case 2:
        if (N != 100) {
          System.out.println(N * 100 * 100);
        } else {
          System.out.println((N + 1) * 100 * 100);
        }       
        break;
    }
  }
}
