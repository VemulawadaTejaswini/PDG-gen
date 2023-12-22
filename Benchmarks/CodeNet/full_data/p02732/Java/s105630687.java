import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int maxn=(int) (2e5+10);
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int vis[]=new int [maxn];
		int a[]=new int[maxn];
		int n=cin.nextInt();
		for(int i=1;i<=n;i++)
		{
			a[i]=cin.nextInt();vis[a[i]]++;
		}
		
		int ans[]=new int[maxn];
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			ans[i]=vis[i]*(vis[i]-1)/2;
			sum+=ans[i];
		}
		//System.out.println(sum);
		for(int i=1;i<=n;i++)
		{
			System.out.println(sum-vis[a[i]]+1);
		}
		
	}

	
}