import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    
    int ans = 0;
    int now = 0;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(sc.next());
      if(now == n){
        now = 0;
        ans++;
      }else{
        now = n;
      }
    }
      
    System.out.println(ans);
  }
}