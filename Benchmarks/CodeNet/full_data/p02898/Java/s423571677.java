import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int K = Integer.parseInt(S[1]);
    
    int ans = 0;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      if(n >= K){
        ans++;
      }
    }
    System.out.println(ans);
  }
}
