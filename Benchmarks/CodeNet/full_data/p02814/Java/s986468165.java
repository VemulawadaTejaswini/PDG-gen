import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		long N, M;
		N = in.nextInt();
		M = in.nextInt();
		long lcm = 1;
		for (int i = 0; i < N; i++)
		{
			long temp = in.nextInt();
			long gcd = 1;
			for (long j = 1; j <= temp && j <= lcm; ++j)
			{
				if(temp % j == 0 && lcm % j == 0)
					gcd = j;
			}
			
			lcm = (temp * lcm) / gcd;
		}
		lcm /= 2;
		System.out.println(M/lcm - M/(lcm*2));
		in.close();
	}
}
