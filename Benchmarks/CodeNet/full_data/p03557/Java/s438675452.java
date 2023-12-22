import java.util.*;
import static java.lang.System.*;

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = sc.nextInt();
    Integer A[] = new Integer[N];
    Integer B[][] = new Integer[N][2];
    Integer C[] = new Integer[N];
    for(int i=0; i<N; i++) A[i] = sc.nextInt();
    for(int i=0; i<N; i++) B[i][0] = sc.nextInt();
    for(int i=0; i<N; i++) C[i] = sc.nextInt();
    int number = 0;
    Arrays.sort(A, Comparator.reverseOrder());
    Arrays.sort(B, (a,b) -> Integer.compare(b[0], a[0]));
    Arrays.sort(C, Comparator.reverseOrder());
    for(int i=0; i<N; i++){
      while(number < N && C[number] > B[i][0]) number++;
      B[i][1] = number;
    }
    long ans = 0;
    number = 0;
    long tmp = 0;
    for(int i=0; i<N; i++){
      while(number < N && B[number][0] > A[i]){
        tmp += B[number][1];
        number++;
      }
      ans += tmp;
    }
    out.println(ans);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}