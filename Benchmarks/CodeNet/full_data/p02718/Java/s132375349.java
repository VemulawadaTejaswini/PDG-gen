import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		double mark = (double)1/((4*m));
		int count = 0;
		int total = 0;
		int[] arr = new int[n];
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		for(int i = 0;i<n;i++)
		{
			int votes = arr[i];
			if(votes >= (total * mark))
				count++;
		}
		System.out.println(count>=m?"Yes":"No");
	}
}