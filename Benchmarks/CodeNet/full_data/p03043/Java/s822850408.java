import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		int N,K;
		double n;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		double Ans=0;
		for(int i=1;i<=N;i++)
		{
			int count =0;
			n = Math.log(K)/Math.log(2)-Math.log(i)/Math.log(2);
			n = Math.ceil(n);
			Ans+= Math.pow(0.5,n)/N;
			System.out.println("n="+n+",Ans ="+ Ans);
		}
		System.out.println(Ans);
	}
}
