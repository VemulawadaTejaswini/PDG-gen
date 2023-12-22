import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      String[] S = br.readLine().split(" ");
      int K = Integer.parseInt(S[0]);
      int X = Integer.parseInt(S[1]);
      int Y = Integer.parseInt(S[2]);
      int[] ans = new int[K];
      for(int i = 1; i <= K; i++){
        for(int j = i+1; j <= K; j++){
            int a = j-i;
            int b = Math.abs(X-i)+Math.abs(Y-j)+1;
          int r = Math.min(a,b);
          ans[r]++;
        }
      }
      for(int i = 1; i <= K; i++){
        System.out.println(ans[i]);
      }
    }catch(Exception e){
    }
  }
}