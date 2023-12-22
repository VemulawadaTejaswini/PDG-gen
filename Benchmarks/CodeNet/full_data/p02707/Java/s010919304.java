import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++)
		{
			arr[i] = 0;
		}
		for(int i = 0;i<n-1;i++)
		{
			int input = sc.nextInt()-1;
			arr[input]++;
		}
		for(int i = 0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}