import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long p = 1000000007;
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    int r = 0, g = 0, b = 0;
    long ans = 1;
    for(int i = 0; i < N; i++){
      int M = Integer.parseInt(S[i]);
      int count = 0;
      if(r == M) count++;
      if(g == M) count++;
      if(b == M) count++;
      
      ans *= count;
      ans %= p;
      
      if(r == M){
        r++;
      }else if(g == M){
        g++;
      }else if(b == M){
        b++;
      }
    }
    System.out.println(ans);
  }
}
