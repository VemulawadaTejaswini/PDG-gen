import java.util.*;
 
public class Main{
  	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int ans = 0;
      int tmp = 0;
      int prev = sc.nextInt();
      int now = 0;
      for(int i = 1 ; i < n ; i++){
        now = sc.nextInt();
        if(prev >= now){
          tmp++;
        }else{
          ans = ans < tmp ? tmp : ans;
          tmp = 0;
        }
        prev = now;
      }
      ans = ans < tmp ? tmp : ans;
      
      System.out.println(ans);
      return;
    }
}