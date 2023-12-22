import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();

		int[] arr = new int[q];

		for(int i = 0; i < q; i++)
			arr[i] = sc.nextInt();

		int[] points = new int[n];

		for(int i = 0; i < n; i++)
		{
			points[i] = k;
		}

		for(int i = 0; i < q; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(arr[i] == j+1)
				{

				}
				else
					points[j] -= 1;
			}
		}

		for(int i = 0; i < n; i++)
		{
			if(points[i] <= 0)
			{
				System.out.println("No");
			}
			else
			{
				System.out.println("Yes");
			}
		}
	}
}