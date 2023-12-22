import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		int N,X,Y,Ans=0;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int[] V = new int[N];
		int[] C = new int[N];
		for(int i=0;i<N;i++)
		{
			V[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++)
		{
			C[i] = sc.nextInt();
		}
		int comp;
		for(int i=0;i<N;i++)
		{
			comp = V[i] - C[i];
			if(comp>0) Ans+=comp;
		}
		System.out.println(Ans);
	}
}