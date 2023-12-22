import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long[] a = new long[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextLong();
		
		long sum1 = 0; //start with neg
		long pay1 = 0;
		long last1 = 0;
		int sign1;
		long sum2 = 0; //start with neg
		long pay2 = 0;
		long last2 = 0;
		int sign2;
		
		for(int i = 0; i < n; i++)
		{
			sign1=i%2==0?-1:1;
			sign2=i%2==0?1:-1;
			long cur = a[i];
			//1
			{
				if(sign1 == -1 && sum1+cur >= 0)
				{
					pay1 += (sum1+cur) + 1;
					last1 = 1;
					sum1 = -1;
				}
				else if(sign1 == 1 && sum1+cur <= 0)
				{
					pay1 += 1 - (sum1+cur);
					sum1 = 1;
				}
				else
				{
					sum1 += cur;
				}
			}
			//2
			{
				if(sign2 == -1 && sum2+cur >= 0)
				{
					pay2 += (sum2+cur) + 1;
					last2 = 1;
					sum2 = -1;
				}
				else if(sign2 == 1 && sum2+cur <= 0)
				{
					pay2 += 1 - (sum2+cur);
					sum2 = 1;
				}
				else
				{
					sum2 += cur;
				}
			}
		}
		
		System.out.println(Math.min(pay1, pay2));
	}

}
