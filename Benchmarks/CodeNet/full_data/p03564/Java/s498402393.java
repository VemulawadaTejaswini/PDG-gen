import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] memo = new int[N+1];
    int ans =0;
    for (int i=0; i<N; i++) {
      memo[0] = 1;
      memo[i+1] = min(memo[i],K);
    }
    System.out.println(memo[N]);
  }
  
  public static int min(int x,int y) {
    return Math.min(x * 2, x + y);  
  }
}