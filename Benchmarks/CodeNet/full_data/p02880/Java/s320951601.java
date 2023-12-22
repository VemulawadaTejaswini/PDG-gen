import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=2; i<10; i++)
		{
			int f = n%i;
			if(f == 0)
			{
				int a = n/i;
				if(a > 0 && a < 10)
				{
					if(a < 10 && a > 10)
					{
						System.out.println("Yes");
						break;
					}
				}
				else if(i == 9)
				{
					System.out.println("No");
				}
			}
			else if(i == 9)
			{
				System.out.println("No");
			}
		}
	}
}