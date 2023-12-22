import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      String[] S = br.readLine().split(" ");
      int N = Integer.parseInt(S[0]);
      int M = Integer.parseInt(S[1]);
      
      S = br.readLine().split(" ");
      int sum = 0;
      int[] nums = new int[N];
      for(int i = 0; i < N; i++){
        nums[i] = Integer.parseInt(S[i]);
        sum += nums[i];
      }
      
      double d = sum*(1.0/(4*M));
      int count = 0;
      for(int i = 0; i < N; i++){
        if(nums[i] >= d){
          count++;
        }
      }
      System.out.println(count >= M ? "Yes" : "No"); 
    }catch(Exception e){
    }
  }
}
