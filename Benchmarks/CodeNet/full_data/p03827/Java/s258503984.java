import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    String S = sc.next();
    
    int ans = 0;
    int now = 0;
    for(int i = 0; i < N; i++){
      if(S.charAt(i) == 'I'){
        now++;
      }else{
        now--;
      }
      ans = ans < now ? now : ans;
    }
    
    System.out.println(ans);
  }
}