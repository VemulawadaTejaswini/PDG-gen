package trial;

import java.util.*;
public class Main{
   

  public static long ways(char matrix[][],int n,int m,int i,int j,long dp[][])
  {
	  
	  if(matrix[i][j]=='#') {
		  dp[i][j]=0;
		  return 0;}
	  if(i==n-1&&j==m-1)
		  return 1;
	  
	  if(dp[i][j]==-1) {
		  
	  long op1=0,op2=0;
	  if((i+1)<n&&j<m)
	  {
		op1=(ways(matrix,n,m,i+1,j,dp))%1000000007;
	  }
	  if(i<n&&j+1<m)
	  {
			op2=ways(matrix,n,m,i,j+1,dp)%1000000007;
		
	  }
	  dp[i][j]=(op1+op2)%1000000007;
	 
	  }
	  return dp[i][j];
  }
	
  public static void main(String[] args)
  {
     
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int m=s.nextInt();
  char matrix[][]=new char[n][m];
  for(int i=0;i<n;i++)
  {
	String line=s.next();
	String str[]=line.split("");
	  for(int j=0;j<m;j++) {
		  matrix[i][j]=str[j].charAt(0);}
  }
  long dp[][]=new long[n][m];
  for(int i=0;i<n;i++)
  {
	  for(int j=0;j<m;j++)
	  {
		  dp[i][j]=-1;
	  }
  }

  System.out.println( ways(matrix,n,m,0,0,dp));
  
  s.close();
    
  }
}
