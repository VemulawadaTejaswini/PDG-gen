/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
    public static void func(double p [], int n , int head, int tail,int curr, List <Double> ls , double ans )
    {
        if((n-tail)<=tail)
        {
            return ;
        }
        
        if(curr>=n)
        {
            Double xx=ls.remove(0);
            xx=xx+ans;
          
            ls.add(xx);
            return;
        }
    
        func(p,n,head+1,tail,curr+1,ls,p[curr]*ans);
        func(p,n,head,tail+1,curr+1,ls,(1.0-p[curr])*ans);
        
        
        
        
        
        
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
		List <Double> ls =new ArrayList();
		ls.add(0.0);
		func(p,n,0,0,0,ls,1.0);
		System.out.println(ls.get(0));
	
		
	}
}
