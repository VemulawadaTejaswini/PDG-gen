/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
    public static double func(double p [], int n , int head, int tail,int curr, double ans)
    {
        if((n-tail)<=tail)
        {
            return 0.0;
        }
        
        if(curr>=n)
        {
            
            return ans;
            
        }
        
        return func(p,n,head+1,tail,curr+1,p[curr]*ans)+func(p,n,head,tail+1,curr+1,(1.0-p[curr])*ans);
      
    }
    
    
	public static void main(String[] args) throws Exception {
	
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String ss[]=(br.readLine()).split(" ");
		
		double p[]=new double [n];
		for (int i=0;i<n;i++)
		{
		    p[i]=Double.parseDouble(ss[i]);
		    
		}
	
		double ans1=func(p,n,0,0,0,1.0);
		System.out.println(ans1);
		
		
	}
}
