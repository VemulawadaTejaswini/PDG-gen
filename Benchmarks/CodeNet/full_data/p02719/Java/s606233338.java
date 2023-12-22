
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long K = sc.nextLong();
    long ans =0;
    N = N%K;
    ans =N;
    for(int i=0;i<100;i++){
      N=Math.abs(N-K);
      if(N<ans){
        ans=N;
      }
    }
    System.out.println(ans);

  }
  

  
}
