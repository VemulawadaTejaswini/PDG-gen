import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] T = new int[N];
    int[] A = new int[N];
    for (int i =0; i<N; i++) {
      T[i] = sc.nextInt();
      A[i] = sc.nextInt();
    }
    for (int i =0; i<N-1; i++) {
      long tmpA = A[i+1];
      long tmpT = T[i+1];  
      while (A[i+1] < A[i] || T[i+1] < T[i]) {
        A[i+1] += tmpA;
        T[i+1] += tmpT;
      }
    }
    System.out.println(A[N-1] + T[N-1]);
  }
}