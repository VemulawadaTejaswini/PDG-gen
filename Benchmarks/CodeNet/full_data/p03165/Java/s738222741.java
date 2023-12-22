import java.util.*;
public class Main{
  public static void main(String[] args){
	
	      Scanner s=new Scanner(System.in);
	      String s1=s.next();
	      String s2=s.next();
	      int[][] dp=new int[s1.length()+1][s2.length()+1];
	      for(int i=0;i<dp.length;i++)
	        Arrays.fill(dp[i],0);
	      for(int i=1;i<dp.length;i++){
	        for(int j=1;j<dp[0].length;j++){
	          if(s1.charAt(i-1)==s2.charAt(j-1)){
	            dp[i][j]=dp[i-1][j-1]+1;
	          }
	          else{
	               dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
	          }
	             }
	             }
	             
	             int len=dp[dp.length-1][dp[0].length-1];
	             StringBuilder res=new StringBuilder();
	             int i=dp.length-1;
	             int j=dp[0].length-1;
	             while(len>0) {
	            	 if(s1.charAt(i-1)==s2.charAt(j-1)) {
	            		 res.append(s1.charAt(i-1));
	            		 i--;
	            		 j--;
	            		 len--;
	            	 }
	            	 else if(dp[i-1][j]>dp[i][j-1]) {
	            		 i--;
	            	 }
	            	 else
	            		 j--;
	             }
	             
	             System.out.println(res.reverse().toString());
	             }
	             }
	             
	             
	             