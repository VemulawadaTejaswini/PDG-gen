
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner jk = new Scanner(System.in);
		int n = jk.nextInt();
		int[] arr = new int[n];
		for (int i=0; i<n; i++)
		{
			arr[i] = jk.nextInt();
		}
		Arrays.sort(arr);
		double ans = (arr[0]+arr[1])/2.0;
		for (int i=2; i<n; i++)
		{
			ans = (ans+arr[i])/2.0;
		}
		System.out.println(ans);
		
	}

}
