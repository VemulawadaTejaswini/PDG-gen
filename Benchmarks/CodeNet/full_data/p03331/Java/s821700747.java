import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int min = Integer.MAX_VALUE;
    for (int i = 1; i <= (N / 2); i++) {
      int a_sum = digitSum(i);
      int b_sum = digitSum(N - i);
      if (a_sum + b_sum < min) {
        min = a_sum + b_sum;
      }
    }
    System.out.println(min);
  }

  public static int digitSum(int num) {
    int tmp = num;
    int sum = 0;
    while (tmp > 0) {
      sum += (tmp % 10);
      tmp /= 10;
    }
    return sum;
  }
}