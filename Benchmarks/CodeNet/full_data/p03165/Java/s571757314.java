import java.util.*;
public class Main {
	public static void main(String args[]){
    	Scanner s = new Scanner(System.in);
      	String s1 = s.next();
      	String s2 = s.next();
      	String ans = ans(s1,s2);
      	System.out.println(ans);
    }
  	public static String ans(String s1, String s2){
      	int M = s1.length(), N = s2.length();
      	if(N<=0 || M<=0)
          	return "";
      	char[] c1 = s1.toCharArray();
      	char[] c2 = s2.toCharArray();
      	int dp[][] = new int[M+1][N+1];
      	for(int i=1;i<=M;i++){
        	for(int j=1;j<=N;j++){
            	dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
              	if(c1[i-1]==c2[j-1]){
                	dp[i][j] = Math.max(dp[i][j],1+dp[i-1][j-1]);
                }
            }
        }
      	char[] result = new char[dp[M][N]];
      	int index = result.length-1,i=M,j=N;
      	while(i>0 && j>0){
        	if(c1[i-1]==c2[j-1]){
            	result[index--] = c1[i-1];
              	i--;
              	j--;
            } else if(dp[i-1][j]>dp[i][j-1]){
                i--;
            } else {
            	j--;
            }
        }
      	return new String(result);
    }
}