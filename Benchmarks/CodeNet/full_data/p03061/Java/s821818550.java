import java.util.*;
public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[] A = new int[N];

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    sc.close();

    int[] L = new int[N+1];
    int[] R = new int[N+1];
    
    L[0] = A[0];
    R[N] = A[N-1];

    for (int i = 1; i < N; i++) {
      L[i] = gcd(L[i-1], A[i]);
    }

    for (int i = N - 1; 0 < i; i--) {
      R[i] = gcd(A[i-1],R[i+1]);
    }

    int[] M = new int[N+1];

    for (int i = 1; i <= N; i++) {
      if (i == 1) {
        M[i] = R[i+1];
      } else if(i == N){
        M[i] = L[i-1];
      } else {
        M[i] = gcd(L[i-2],R[i+1]);
      }
      
    }

    int max = 0;

    for (int i = 1; i < N+1; i++) {
      max = Math.max(M[i],max);
    }    
    
    System.out.println(max);
 
  }

  public static int gcd(int x, int y){

    if (x < y) {
      int t = x;
      x = y;
      y = t;
    }

    while (y > 0) {
      int r = x % y;
      x = y;
      y = r;
    }

    return x;
    
  }

}