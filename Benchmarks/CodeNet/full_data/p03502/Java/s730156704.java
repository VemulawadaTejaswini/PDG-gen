import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    if (N % digitSum(N) == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  public static int digitSum(int number) {
    int sum = 0;
    while (number > 0) {
      sum += (number % 10);
      number /= 10;
    }
    return sum;
  }
}