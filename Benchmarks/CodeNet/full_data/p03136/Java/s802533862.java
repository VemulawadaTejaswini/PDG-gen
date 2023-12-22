import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		
		Scanner sc = new Scanner (System.in);
		int[] a = new int[sc.nextInt()]; 
		
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		for(int i = 0; i < a.length - 1; i++)
		{
			sum = sum + a[i];
		}
		
		if(a[a.length - 1] >= sum){
			System.out.println("No");
		} else 
		{
			System.out.println("Yes");
		}
		
	}
}
