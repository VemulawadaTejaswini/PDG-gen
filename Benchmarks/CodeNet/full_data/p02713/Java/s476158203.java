import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a,b,c;
		int output = 0;
		for(a = 1;a<=num;a++)
			for(b = 1;b<=num;b++)
				for(c = 1;c<=num;c++)
					output += gcd(gcd(a,b),c);
		System.out.println(output);
	}
	
	public static int gcd(int p, int q)
	{
		if(q == 0)
		{
			return p;
		}
		return gcd(q,p%q);
	}

}