import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		int shouldbe = 0;
		boolean flag = n%2==1;
		if(n%2==0)shouldbe=1;
		for(int i = 0; i < n; i++)
		{
			if(shouldbe != a[i])
			{
				System.out.println(0);
				return;
			}
			
			if(flag)
				shouldbe += 2;
			flag = !flag;
		}
		
		long an = 1;
		long MOD = 1000000007;
		for(int i = 0; i < n/2; i++)
		{
			an = (an*2)%MOD;
		}
		System.out.println(an);

	}

}
