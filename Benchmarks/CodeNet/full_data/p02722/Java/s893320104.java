import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int c=0;
		    for(int i=2;i<=n;i++)
		    {
		        int k=n;
		        while(k>0)
		        {
		            if(k==1)
		            break;
		            if(k%i==0)
		            k=k/i;
		            else
		            k-=i;
		            
		        }
		        if(k==1)
		        c++;
		    }
		    System.out.println(c);
		} catch(Exception e) {
		}
	}
}
