import java.util.*;
import java.lang.*;
import java.io.*;
class Security
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int count = 0;
		for(int i = 0; i <3; i++)
		{
		    if(S.charAt(i) == S.charAt(i+1))
		    {
		        count = 1;
		        break;
		    }
		}
		if(count == 1)
		{
		    System.out.println("Bad");
		}
		else
		{
		    System.out.println("Good");
		}
	}
}
