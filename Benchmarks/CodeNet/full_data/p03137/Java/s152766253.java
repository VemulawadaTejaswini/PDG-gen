import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N,M;
    N = sc.nextInt();
    M = sc.nextInt();
    int X[] = new int[M];
    for(int i=0; i<M; i++) X[i] = sc.nextInt();
    Arrays.sort(X);
    int interval[] = new int[M-1];
    for(int i=0; i<M-1; i++){
      interval[i] = X[i+1] - X[i];
    }
    Arrays.sort(interval);
    int ans = 0;
    for(int i=0; i<M-N; i++){
      ans += interval[i];
    }
    System.out.println(ans);
                               
  }
}