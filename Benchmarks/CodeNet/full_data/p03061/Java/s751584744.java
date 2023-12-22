import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int A[] = new int[N];
    for (int i = 0; i < N; i++){
      A[i] = Integer.parseInt(sc.next());
    }

    int L[] = new int[N];
    int R[] = new int[N];
    L[0] = A[0];
    for (int i = 1; i < N; i++){
      L[i] = gcd(L[i-1], A[i]);
    }
    R[N-1] = A[N-1];
    for (int i = N-2; i > 0; i--){
      R[i] = gcd(R[i+1], A[i]);
    }
    int ans = gcd(R[1], L[N-1]);
    for (int i = 1; i <= N-2; i++){
      ans = Math.max(ans, gcd(L[i-1], R[i+1]));
    }
    System.out.println(ans);
  }

  static int gcd(int a, int b){
    int tmp;
    if (a < b){
      tmp = a;
      a = b;
      b = tmp;
    }
    while (true) {
      tmp = a % b;
      if (tmp == 0) {
        return b;
      }
      a = b;
      b = tmp;
    }
  }
}
