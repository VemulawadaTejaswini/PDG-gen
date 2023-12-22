import java.util.*;
public class Main{ 

   public static void main(String args[]) {
	 
	   Scanner s=new Scanner(System.in);
	   int r=s.nextInt();
	   int c=s.nextInt();
	   char arr[][]=new char[r][c];
		 
			  	   
		   for(int i=0;i<r;i++) {
			 String str=s.next();
		      for(int j=0;j<c;j++) {
		    	  arr[i][j]=str.charAt(j);
		      }
	      }
		   
		   
		   
	   int dp[][]=new int[r][c];
	   dp[0][0]=1;
	   for(int i=1;i<c;i++) {
		   if(arr[0][i]=='#') {
			   dp[0][i]=0;
		   }
		   else {
			   dp[0][i]=dp[0][i-1];
		   }
	   }
	   
	   for(int i=1;i<r;i++) {
		   if(arr[i][0]=='#') {
			   dp[i][0]=0;
		   }
		   else {
			   dp[i][0]=dp[i-1][0];
		   }
	   }
	   
	   for(int i=1;i<r;i++) {
		   for(int j=1;j<c;j++) {
			   if(arr[i][j]=='#') {
				   dp[i][j]=0;
				   continue;
			   }
			   dp[i][j]=dp[i-1][j]+dp[i][j-1];
		   }
	   }
	  
	   System.out.println(dp[r-1][c-1]);
   }
}