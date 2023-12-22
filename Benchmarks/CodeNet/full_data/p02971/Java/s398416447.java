import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    
    for(int i=0; i<N; i++) {
      A[i] = sc.nextInt();
    }
    for(int j=0; j<N; j++) {
      int X = A[j];
      A[j] = 0;
      int M =0;
      for(int k=0; k<N; k++) {
        if(M<A[k]) {
          M = A[k];
        }
      }
      System.out.println(M);
      A[j] = X;
    }
  }
}