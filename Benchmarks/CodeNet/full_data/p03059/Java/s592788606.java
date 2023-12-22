import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		int A,B,T,Ans=0;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		T = sc.nextInt();
		T+=0.5;
		for(int i=0;i<T;i++)
		{
			if((i+1)%A==0)	Ans+=B;
		}
		System.out.println(Ans);
	}
}