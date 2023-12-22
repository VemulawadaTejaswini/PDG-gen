import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());
    int Q = Integer.parseInt(sc.next());
    
    int[] val = new int[N];
    for(int i = 0; i < Q; i++){
      int A = Integer.parseInt(sc.next());
      val[A-1]++;
    }
    
    String ans = "";
    for(int i = 0; i < N; i++){
      if(Q-val[i] < K){
        ans = "Yes";
      }else{
        ans = "No";
      }
      System.out.println(ans);
    }
  }
}