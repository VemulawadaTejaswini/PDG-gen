import java.util.Scanner;

public class abc124a
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int a,b,sum=0;
		a = stdIn.nextInt();
		b = stdIn.nextInt();
		for(int i=0;i<2;i++)
		{
			if(a>b)
			{
				sum+=a;
				a--;
			}
			else
			{
				sum+=b;
				b--;
			}
		}
		
		System.out.println(sum);
	}
}