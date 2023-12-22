
import java.util.Scanner;

public class Main
{

	public static void main(String[] args) 
	{
		assert(false);
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long i1 = sc.nextLong();
		long i2 = sc.nextLong();
		long a = Math.min(i1, i2);
		long b = Math.max(i1, i2);
		
		if((a%2==0)==(b%2==0))
		{
			long dis = b-a;
			System.out.println(dis/2);
		}
		else
		{
			long l = b-1; //both go left
			long r = n-a; //both go right
			long ans = (Math.min(l, r));
			
//			if(a%2 != b%2)
			{
				{
					//a goes to 1 then go right again
					long time = 0;
					time += a-1; //a goes to 1
					time++; //a waits there 1 turn, now both are odd (even)
					long curb = Math.max(b - time, 1);
					
//					if((curb%2 != 0))
					{ //now they meet
						long dis = curb-1;
						ans = Math.min(ans, time + (dis/2));
					}
				}
//				if(n%2!=b%2)
				{ //b goes to right and waits a turn
					long time = n - b + 1; //now both are even
					long cura = Math.min(a + time, n);
//					if((cura%2 == 0))
					{ //now they meet
						long dis = n-cura;
						ans = Math.min(ans, time + (dis/2));
					}
				}
			}
			
			System.out.println(ans);
		}
			

	}

}
