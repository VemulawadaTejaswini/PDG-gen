import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    Integer H[] = new Integer[N];
    for(int i=0;i<N;i++) H[i] = sc.nextInt();
    Integer dp[] = new Integer[N];
    for(int i=1;i<N;i++) dp[i] = Integer.MAX_VALUE;
    dp[0] = 0;
    
    for(int i=0;i<N-1;i++){
      for(int d=1;d<=K&&i+d<N;d++){
        dp[i+d] = Math.min(dp[i+d], dp[i]+Math.abs(H[i+d]-H[i]));
      }
    }
    
    System.out.println(dp[N-1]);
  }
}