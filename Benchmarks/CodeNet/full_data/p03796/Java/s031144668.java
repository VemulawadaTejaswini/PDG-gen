import java.util.*;

class Main 
{
  	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long temp = 1;

		for(int i = 1; i <= n; i++)
			temp *= i;

		System.out.println(temp);
  	}
}