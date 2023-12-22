import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int K = Integer.parseInt(sc.nextLine());
    int ans = 1;
    for(int i = 0; i < K; i++){
      if(ans < N){
        ans *= 2;
      }else{
        ans += N;
      }
    }
    
    System.out.println(ans);
  }
}