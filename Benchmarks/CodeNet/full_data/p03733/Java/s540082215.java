import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int t [] = new int [N];
    
    for(int i=0; i<N; i++){
      t[i] = sc.nextInt();
    }
    
    int ans = 0;
    for(int i=1; i<N; i++){
      if(t[i]-t[i-1]>=T){
        ans += T;
      }else{
        ans += t[i]-t[i-1];
      }
    }
   System.out.println(ans); 
  }
}