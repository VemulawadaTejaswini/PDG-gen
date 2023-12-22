import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), M = sc.nextInt(), total=0;
    int A[] = new int[M];
    for(int i=0; i<M; i++) {
      A[i] = 0;
    }
    
    for(int j=0; j<N; j++) {
      int L = sc.nextInt();
      for(int k=0; k<L; k++) {
        int f = sc.nextInt();
        A[f-1] ++;
      }
    }
    
    for(int l=0; l<M; l++) {
      if(A[l] == N) {
        total++;
      }
    }
    System.out.println(total);
  }
}