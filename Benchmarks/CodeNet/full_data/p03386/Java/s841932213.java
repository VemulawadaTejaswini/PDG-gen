import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int K = sc.nextInt();
    for (int i = A; i < A+K && i <= B; i++) {
      System.out.println(i);
    }
    int start = Math.max(A+K, B-K+1);
    for (int i = start; i <= B; i++) {
      System.out.println(i);
    }
  }
}