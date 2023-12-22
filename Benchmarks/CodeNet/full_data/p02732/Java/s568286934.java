import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] A = new int[N];
    for(int i=0; i<N; i++) {
      A[i] = scan.nextInt();
    }
    scan.close();

    int[] B = new int[N];
    for(int i=0; i<N; i++) {
      B[A[i]-1]++;
    }

    int[] C = new int[N];
    int sum = 0;
    for(int i=0; i<N; i++) {
      C[i] = B[i] * (B[i] - 1) / 2;
      sum += C[i];
    }

    for(int i=0; i<N; i++) {
      System.out.println(sum - B[A[i]-1] + 1);
    }
  }
}