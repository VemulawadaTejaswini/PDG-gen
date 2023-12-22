import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args){
    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    String s, t;
    try{
      s = sc.readLine();
      t = sc.readLine();
    }catch(Exception e){
      System.out.println(e);
      return;
    }
    String[][] memo = new String[s.length()+1][t.length()+1];
    Arrays.fill(memo[0], "");
    for(int i = 0; i < memo.length; i++){
      memo[i][0] = "";
    }
    System.out.println(solve(memo, s, t));
  }
  
  public static String solve(String[][] memo, String s, String t){
    StringBuilder sb = new StringBuilder();
    for(int i = 1; i < memo.length; i++){
      for(int j = 1; j < memo[i].length; j++){
        if(s.charAt(i-1) == t.charAt(j-1)){
          sb.append(memo[i-1][j-1]);
          sb.append(s.charAt(i-1));
          memo[i][j] = sb.toString();
          sb.setLength(0);
        }else{
          memo[i][j] = memo[i-1][j].length() > memo[i][j-1].length() ? 
            memo[i-1][j] : memo[i][j-1];
        }
      }
    }
    return memo[s.length()][t.length()];
  }
}