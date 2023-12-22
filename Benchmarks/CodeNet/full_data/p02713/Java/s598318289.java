import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      int N = Integer.parseInt(br.readLine());
      long ans = 0;
      for(int i = 1; i <= N; i++){
        for(int j = 1; j <= N; j++){
          for(int k = 1; k <= N; k++){
            ans += gcd(i, gcd(j, k));
          }
        }
      }
      System.out.println(ans);
    }catch(Exception e){
    }
  }
  
  static long gcd(long a, long b){
    if(a > b){
      return gcd(b, a);
    }
    
    if(a == 0){
      return b;
    }
    
    return gcd(b%a, a);
  }
}