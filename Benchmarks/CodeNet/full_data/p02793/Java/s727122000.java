import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		double mod = Math.pow(10, 9) + 7;
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		double[] A = new double[N];
		for(int i = 0; i < N; i++)
			A[i] = in.nextInt();
		
		double num = 1;
		for(double n : A)
		{
//			System.out.println(n);
			num = (num*n)/gcd(num, (double)n);
		}
		
//		System.out.println(num);
			
		double t = 0;
		for(double n : A)
			t = ((t + num/n) % mod);
		System.out.println((int)t);
	}
	
	static double gcd(double a, double b)
	{
		if (b == 0)
			return a;
		
		while(b != 0)
		{
			double temp = a;
			a = b;
			b = temp%b;
		}
		return a;
	}
}