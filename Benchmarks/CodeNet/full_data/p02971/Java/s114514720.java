import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    int B[] = new int[N];
    
    for(int i=0; i<N; i++) {
      A[i] = sc.nextInt();
      B[i] = A[i];
    }
    Arrays.sort(B);
    for(int j=0; j<N; j++) {
      if(A[j] == B[N-1]) {
        System.out.println(B[N-2]);
      } else {
        System.out.println(B[N-1]);
      }
    }
  }
}