import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      long N = Long.parseLong(br.readLine());
      long ans = 0;
      for(long i = 1; i <= N; i++){
        if(i%3 != 0 && i%5 != 0){
          ans += i;
        }
      }
      System.out.println(ans);
    }catch(Exception e){
    }
  }
}