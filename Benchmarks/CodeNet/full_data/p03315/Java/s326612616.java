import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String aa=" ";
		aa=sc.next();
		int a=0;
		char[] b=new char[aa.length()];
		for(int i=0;i<aa.length();i++)
		{
			b[i]=aa.charAt(i);
			if(b[i]=='+')
			{a++;}
			else
			{a--;}
		}
		System.out.println(a);
	}
}