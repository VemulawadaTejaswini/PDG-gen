import java.util.*;

class Main {
  public static final long MOD = 1000000007;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Integer A[] = new Integer[N];
    for(int i=0; i<N; i++){
      A[i] = sc.nextInt() - i;
    }
    int interm;
    Arrays.sort(A);
    if(N % 2 == 1){
      interm = A[(N-1) / 2];
    }else{
      interm = (A[N/2] + A[N/2-1]) / 2;
    }
    Long ans = 0L;
    for(int i=0; i<N; i++){
      ans += Math.abs(A[i] - interm);
    }
    System.out.println(ans);
    
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}