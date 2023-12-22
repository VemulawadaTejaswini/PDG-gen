import java.util.Scanner;

public class Main {

	static  Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n, sum = 0;
		n = in.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i]  = in.nextInt();
		}
		for(int i = 0; i < n; i++)
		{
			for(int j = i + 1; j < n; j++)
			{
				sum += arr[i] * arr[j];
			}
		}
		System.out.println(sum);
		
	}

}
