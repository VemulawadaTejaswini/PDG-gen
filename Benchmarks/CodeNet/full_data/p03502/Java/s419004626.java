
import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int num = findSumOfDigits(N);

    System.out.println(N % num == 0 ? "Yes" : "No");
  }

  public static int findSumOfDigits(int tmp) {
    int ret = 0;
    while (tmp > 0) {
      ret += tmp % 10;
      tmp = tmp / 10;
    }
    return ret;
  }
}
