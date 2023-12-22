import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
	
public class Main
{ 		
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		int n = scan.nextInt();
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		for(int i=0;i<n;i++)
			arr1[i] = scan.nextInt();
		
		for(int i=0;i<n;i++)
			arr2[i] = scan.nextInt();
		
		int result = 0;
		
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				result ^= (arr1[i]+arr2[j]);
		System.out.println(result);
	}
}
