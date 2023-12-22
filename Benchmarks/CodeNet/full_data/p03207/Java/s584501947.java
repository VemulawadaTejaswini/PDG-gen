import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b=0,sum=0,max=0;
		a = sc.nextInt();
		
		int[] ary = new int[a];
		
		for(int i=0;i<a;i++)
		{
			ary[i] = sc.nextInt();
			if(ary[i]>max)
			{
				max = ary[i];
				b = i;
			}
		}
		
		for(int i=0;i<a;i++)
		{
			if(i==b)
				sum+=ary[i]/2;
			else
				sum+=ary[i];
		}
	
		
		
		
		System.out.println(sum);
	}
}