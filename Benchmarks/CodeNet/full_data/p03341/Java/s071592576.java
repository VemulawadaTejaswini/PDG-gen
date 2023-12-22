import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    
    int cnt_E = 0;
    int cnt_W = 0;
    
    for(int i=0; i<S.length(); i++){
      if(S.charAt(i)=='E'){
        cnt_E++;
      } else {
        cnt_W++;
      }
    } 
    
    int ans = Math.min(cnt_E, cnt_W);
    System.out.println(ans - 1);
    
  }
}