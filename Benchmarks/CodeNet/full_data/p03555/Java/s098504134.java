import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s,s1;
		Scanner sc =new Scanner(System.in);
		int k=0;
		s=sc.next();
		s1=sc.next();
		for(int i=0;i<3;i++)
		{
		        if(s.charAt(i)!=s1.charAt(2-i))
		        {
		            k=1;
		        }
		}
		if(k==1)
		{
		    System.out.println("NO");
		}
		else
		{
		    System.out.println("YES");
		}
	}
}