import java.util.Scanner;
import java.util.Arrays; 

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    int[] C = new int[N];
    for (int i =0; i<N; i++) {
      A[i] = sc.nextInt();
    }
    for (int i =0; i<N; i++) {
      B[i] = sc.nextInt();
    }
    for (int i =0; i<N; i++) {
      C[i] = sc.nextInt();
    }
    Arrays.sort(A);Arrays.sort(B);Arrays.sort(C);
    long ans =0;
    for (int k =0; k<N; k++) {
      int countA =0, countC =0;
      int i =0, j =N-1;
      while (A[i] < B[k]) {
        countA++;
        if (i == N-1) {
          break;
        }
        i++;
      }
      while (C[j] > B[k]) {
        countC++;
        if (j ==0) {
          break;
        }
        j--;
      }
      ans += countA * countC;
    }
    System.out.println(ans);
  }
}