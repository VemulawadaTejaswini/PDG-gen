import java.util.*;
import java.io.*;
 
public class Main{
  public static void main(String[]args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);
    String[] S = br.readLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int M = Integer.parseInt(S[1]);
    
    int[][] val = new int[M][3];
    for(int i = 0; i < M; i++){
      String[] T = br.readLine().split(" ");
      val[i][0] = Integer.parseInt(T[0]);
      val[i][1] = Integer.parseInt(T[1]);
      val[i][2] = i;
    }
    Arrays.sort(val, (a, b) -> Integer.compare(a[1], b[1]));
    
    String[] ans = new String[M];
    int[] count = new int[N+1];
    String[] zero = {"00000", "0000","000","00","0"};
    for(int i = 0; i < M; i++){
      StringBuilder sb = new StringBuilder();
      int a = val[i][0];
      count[a]++;
      
      if(a < 10){
        sb.append(zero[0]);
        sb.append(a);
      }else if(a < 100){
        sb.append(zero[1]);
        sb.append(a);
      }else if(a < 1000){
        sb.append(zero[2]);
        sb.append(a);
      }else if(a < 10000){
        sb.append(zero[3]);
        sb.append(a);
      }else if(a < 100000){
        sb.append(zero[4]);
        sb.append(a);
      }else{
        sb.append(a);
      }
      
      int b = count[a];
      if(b < 10){
        sb.append(zero[0]);
        sb.append(b);
      }else if(b < 100){
        sb.append(zero[1]);
        sb.append(b);
      }else if(b < 1000){
        sb.append(zero[2]);
        sb.append(b);
      }else if(b < 10000){
        sb.append(zero[3]);
        sb.append(b);
      }else if(b < 100000){
        sb.append(zero[4]);
        sb.append(b);
      }else{
        sb.append(b);
      }
      
      ans[val[i][2]] = (sb.toString());
    }
    
    for(String s : ans){
     out.println(s); 
    }
    out.flush();
  }
}
