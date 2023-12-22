import java.util.*;

public class Main{
  static int p = 1000000007;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int M = Integer.parseInt(S[1]);
    int[] ans = new int[N];
    Arrays.fill(ans, -1);
    for(int i = 0; i < M; i++){
      S = sc.nextLine().split(" ");
      int a = Integer.parseInt(S[0])-1;
      int b = Integer.parseInt(S[1]);
      
      if((a+1 > N) || (ans[a] != -1 && ans[a] != b)){
        System.out.println(-1);
        return;
      }
      ans[a] = b;
    }
    
    boolean f = false;
    for(int n : ans){
      if(n == -1){
        n = 1;
      }
      if(n == 0 && !f){
        System.out.println(-1);
        return;
      }
      f = true;
      System.out.print(n);
    }
    System.out.println();
  }
}