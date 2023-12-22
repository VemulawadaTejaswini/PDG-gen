import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    String s1=s.next();
    String s2=s.next();
    String[][] dp=new String[s1.length()+1][s2.length()+1];
    for(int i=0;i<dp.length;i++)
      Arrays.fill(dp[i],"");
    for(int i=1;i<dp.length;i++){
      for(int j=1;j<dp[0].length;j++){
        if(s1.charAt(i-1)==s2.charAt(j-1){
          dp[i][j]=dp[i-1][j-1]+s1.charAt(i-1);
        }
        else{
             dp[i][j]=dp[i-1][j].length()>dp[i][j-1].length()?dp[i-1][j]:dp[i][j-1];
        }
           }
           }
           
           System.out.println(dp[s1.length()][s2.length()]);
           }
           }
           
           
           
          
        
    
    