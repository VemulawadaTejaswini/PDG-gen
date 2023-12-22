import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    if (M ==1) {
      System.out.println(0);
      return;
    }
    int[] X = new int[M];
    int[] ds = new int[M-1];
    for (int i =0; i<M; i++) {
      X[i] = sc.nextInt();
    }
    Arrays.sort(X);
    int total =0;
    for (int i =0; i<M-1; i++) {
      ds[i] = X[i+1] - X[i];
      total += ds[i];
    }
    Arrays.sort(ds);
    for (int i =M-2; i>M-N-1; i--) {
      total -= ds[i];
    }
    System.out.println(total);
  }
}