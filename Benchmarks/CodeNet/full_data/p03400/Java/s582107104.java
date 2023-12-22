import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int X = sc.nextInt();
    int totalSum = 0;
    for (int i = 1; i <= N; i++) {
      int A = sc.nextInt();
      int sum = 1;
      for (int j = 1; j*A + 1 <= D; j++) {
        sum++;
      }
      totalSum += sum;
    }
    
    System.out.println(totalSum + X);
  }
}