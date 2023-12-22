import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    long[] A = new long[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    int left = 0;
    int right = 0;
    long max = Integer.MIN_VALUE;
    for (int i = 0; i < N; i++) {
      long sum = 0;
      for (int j = i; j < N; j += 2) {
        sum += A[j];
        if (sum > max) {
          max = sum;
          left = i;
          right = j;
        }
      }
    }
//    System.err.println(right + " "  + left);
    System.out.println(max);
    ArrayList<Integer> ope = new ArrayList<>();
    for (int i = 0; i < N - right - 1; i++) {
      ope.add(N - i);
    }
    for (int i = 0; i < left; i++) {
      ope.add(1);
    }
    for (int i = 0; i < (right - left) / 2; i++) {
      ope.add(2);
    }
    System.out.println(ope.size());
    for (int o : ope) {
      System.out.println(o);
    }
  }

}
