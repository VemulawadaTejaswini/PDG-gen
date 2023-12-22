import java.util.*;

public class atq1
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int h=input.nextInt();
		int a=input.nextInt();
		int count=0;
		while(h>0)
		{
			h-=a;
			count+=1;
		}
		System.out.println(count);

	}
}