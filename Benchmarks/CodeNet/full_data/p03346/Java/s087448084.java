import java.util.Scanner;

public class Main
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int n = sc.nextInt();
		int array[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			array[i] = sc.nextInt();
		}
		
		int required = n;
		int j=n-1;
		while(j>=0)
		{
			if(array[j]==required)
			{
				required-=1;
			}
			j--;
		}
		System.out.println(required);
		
	}
}
