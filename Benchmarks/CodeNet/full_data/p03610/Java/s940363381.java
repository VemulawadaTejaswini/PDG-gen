import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		StringBuffer str=new StringBuffer(sc.nextLine()),
					 ansstr=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			if(i%2==0)
			{
				ansstr.append(str.charAt(i));
			}	
		}
		System.out.println(ansstr);
	}
}