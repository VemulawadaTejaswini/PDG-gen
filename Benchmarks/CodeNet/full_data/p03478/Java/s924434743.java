
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N  = sc.nextInt();
    int A  = sc.nextInt();
    int B  = sc.nextInt();
    int sum = 0;

    for (int i = 1; i <= N; i++) {
      int tmpSum = sum(i);
      sum = (A <= tmpSum && tmpSum <= B) ? sum + i : sum;
    }
    
    System.out.println(sum);
  }

  static int sum(int tmp) {
    int ret = 0;
    while (tmp > 0) {
      ret += tmp % 10;
      tmp = tmp / 10;
    }
    return ret;
  }
}
