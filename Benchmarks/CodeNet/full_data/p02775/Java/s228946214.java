import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    int s = S.length();
    
    int ans = 0;
    for(int i = s-1; i >= 0; i--){
      int n = S.charAt(i) - '0';
      if(n == 0) continue;
      int m = 10-n+1;
      if(n < m){
        ans += n;
      }else{
        ans += m-1;
      }
    }
    System.out.println(ans);
  }
}
