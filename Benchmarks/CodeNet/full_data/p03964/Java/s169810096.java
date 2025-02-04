import java.util.Scanner;

public class Main {
	static int num1 = 1;
	static int num2 = 1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// get a integer
		int N = sc.nextInt();
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		int result = 0;
		for (int i = 0; i < N-1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			result = Main.minVote(a, b);
		}
		System.out.println(result);
		sc.close();
	}
	
	static int minVote(int a, int b) {
		if ( a >= num1 && b >= num2  )
		{
			num1 = a;
			num2 = b;
		}
		else if ( a >= num1 && b < num2  ) // a dominates 
		{
			if (num2 % b == 0)
				num1 = num1 * (num2 / b);
			else {
				int temp = (num2 / b) + 1;
				num2 = b * temp;
				num1 = a * temp;
				//System.out.println("**a = " + a + " temp = " + temp + " num1 = " + num1);
			}
		}
		else if ( a < num1 && b >= num2  )
		{
			if (num1 % a == 0)
				num2 = num2 * (num1 / a);
			else {
				int temp = (num1 / a) + 1;
				num1 = a * temp;
				num2 = b * temp;
			}
		}
		else
		{
			if ((num1 / a) < (num2 / b))
			{
				if (num2 % b == 0)
				{
					//num2 = b * (num2 / b);
					num1 = a * (num2 / b);
				}
				else
				{
					int t = (num2 / b) + 1;
					num2 = b * t;
					num1 = a * t;
				}
			}
			else {
				if (num1 % a == 0)
				{
					num2 = b * (num1 / a);
					//num1 = a;
				}
				else
				{
					int t = (num1 / a) + 1;
					num2 = b * t;
					num1 = a * t;
				}
			}
		}
		//System.out.println("num1 = " + num1);
		//System.out.println("num2 = " + num2);
		return num1 + num2;
	}
}