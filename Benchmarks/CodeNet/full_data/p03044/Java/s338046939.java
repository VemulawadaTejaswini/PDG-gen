import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int[] u = new int[N];
		int[] v = new int[N];
		int[] w = new int[N];
		for(int i=1;i<N;i++)
		{
			u[i] = sc.nextInt();
			v[i] = sc.nextInt();
			w[i] = sc.nextInt();
		}
		int[] color = new int[N+1];
		Arrays.fill(color,2);
		color[1]=0;//BLACK
		for(int i=1;i<N;i++)
		{
			if(color[u[i]]==2)
			{
				color[u[i]]=0;
				if(w[i]%2==0) color[v[i]]=0;
				else color[v[i]]=1;
			}
			else if(color[u[i]]==1)
			{
				if(w[i]%2==0) color[v[i]]=1;
				else color[v[i]]=0;
			}
			else if(color[u[i]]==0)
			{
				if(w[i]%2==0) color[v[i]]=0;
				else color[v[i]]=1;
			}
		}
		for(int i=1;i<N+1;i++)
		{
			System.out.println(color[i]);
		}
	}
}