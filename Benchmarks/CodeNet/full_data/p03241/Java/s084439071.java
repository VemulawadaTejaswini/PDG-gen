import java.util.*;

public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    int prevMaxDiv = 1;
    int maxDiv = 1;
    for (int i = 1; i <= M; i++) {
      if (M % i == 0 && maxDiv < i) {
        prevMaxDiv = maxDiv;
        maxDiv = i;
      }
      if (N < maxDiv) {
        break;
      }
    }
    System.out.println(prevMaxDiv);
  }
}