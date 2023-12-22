import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    long SA = 0;
    long SB = 0;
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      SA += A[i];
    }
    for (int i = 0; i < N; i++) {
      B[i] = sc.nextInt();
      SB += B[i];
    }
    long BC = 0;
    long AC = 0;
    for (int i = 0; i < N; i++) {
      if (A[i] < B[i]) {
        AC += (B[i] - A[i]) / 2;
      } else {
        BC += A[i] - B[i];
      }
    }
    System.out.println(AC >= BC ? "Yes" : "No");
  }

}
