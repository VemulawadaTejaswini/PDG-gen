import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int a,b,sum=0;
		a = stdIn.nextInt();
		b = stdIn.nextInt();
		
		int A = Math.max(a,b);
		int B = Math.min(a,b);
		
		sum = Math.max(2*A-1,A+B);
		
		System.out.println(sum);
	}
}