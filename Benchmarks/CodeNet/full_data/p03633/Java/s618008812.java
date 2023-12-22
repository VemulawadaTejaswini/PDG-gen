import java.util.Scanner;


public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long T_i[] =new long[N];
		for(int i=0;i<N;i++)
		{
			T_i[i]= Long.parseLong(sc.next());
		}
	
		long lcm = N>1 ?lcm(T_i[0],T_i[1]):T_i[0];
		for(int i=2;i<T_i.length;i++)
		{
			
			lcm=lcm(lcm,T_i[i]);
		}
		System.out.println(lcm);
		
	}
	
	static long lcm(long t1,long t2)
	{
		
		if(t1==t2)
		{
			return t1;
		}
		long x=t1;
		long y=t2;

		long gcd=1;
		for(;;)
		{
			if(x<y)
			{
//				System.out.println("x<y:"+x+"/"+y);
				y=y%x;
				if(y==0)
				{
					gcd=x;
					break;
				}
			}
			else if(y<x)
			{
//				System.out.println("y<x:"+x+"/"+y);
				x=x%y;
				if(x==0)
				{
					gcd=y;
					break;
				}
			}
		}
		return t1*(t2/gcd);

	}

}
