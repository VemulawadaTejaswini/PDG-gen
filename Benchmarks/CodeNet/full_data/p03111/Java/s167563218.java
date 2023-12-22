
import java.util.Scanner;

public class Main {
	static int n,A,B,C;
	static int lengths[];
	static int INF=10000000;
	public static int dfs(int cur,int a,int b,int c)
	{
		int ret0,ret1,ret2,ret3;
		
		if(cur==lengths.length)
		{
			if(a==0||b==0||c==0) {
				return INF;
			}
			return Math.abs(a-A)+Math.abs(b-B)+Math.abs(C-c)-30;
			
		}
		ret0=dfs(cur+1,a,b,c);
		ret1=dfs(cur+1,a+lengths[cur],b,c)+10;
		ret2=dfs(cur+1,a,b+lengths[cur],c)+10;
		ret3=dfs(cur+1,a,b,c+lengths[cur])+10;
		return Math.min(Math.min(ret0, ret1),Math.min(ret2, ret3));
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		 n=scan.nextInt();
		 A=scan.nextInt();
		 B=scan.nextInt();
		 C=scan.nextInt();
		 lengths=new int[n];
		for(int i=0;i<n;i++)
		{
			lengths[i]=scan.nextInt();
		}
		System.out.println(dfs(0,0,0,0));
	}
}
