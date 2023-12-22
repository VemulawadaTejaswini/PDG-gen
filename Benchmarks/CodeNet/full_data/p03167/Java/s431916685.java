/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
    
    public static long func(long dp[][],char matrix[][], int i, int j, int h , int w)
    {
        
        if((i>=h) ||(j>=w))
        {
            return 0;
        
        }
        if((i==h-1) && (j==w-1))
        {
            
            return 1;
        
        }
        
        if(dp[i][j]!=0)
        {
            return dp[i][j];
        }
        if(matrix[i][j]=='#')
        {  
            return 0;
        }
        long x=func(dp,matrix,i,j+1,h,w);
        long y=func(dp,matrix,i+1,j,h,w);
        
        
        //System.out.println(x+y);
        return dp[i][j]=(x+y)%1000000007l;
        
        
        
        
    }
    
    
    
    
	public static void main(String[] args) throws Exception {
		//System.out.println("Hello World");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String ss[]=s.split(" ");
		int h=Integer.parseInt(ss[0]);
		int w=Integer.parseInt(ss[1]);
		char ch[];
		char matrix[][]=new char[h][w];
		for(int i=0;i<h;i++)
		{
		    s=br.readLine();
		    ch=s.toCharArray();
		    for (int j=0;j<w;j++)
		    {
		        
		        matrix[i][j]=ch[j];
		    }
		    
		    
		    
		}
		
		long dp[][]=new long[h][w];
            
		long ans =func(dp,matrix,0,0,h,w);
		
		long mod=1000000007l;
		System.out.println(ans%mod);
		
		
	}
}
