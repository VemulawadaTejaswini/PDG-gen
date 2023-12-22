import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sr=h-a;
		int ec=b-1;
		long mod=1000000007;
	  long ar[][]=new long[h][w];
		ar[h-1][w-1]=1;
		for(int i=h-1;i>=0;i--)
		{
			for(int j=w-1;j>=0;j--)
			{
				if(i>=sr&&j<=ec)
				continue;
				if((i+1<sr||j>ec)&&i+1<h)
				ar[i][j]+=ar[i+1][j]%mod;
				int j1=j+1;
				if((i<sr||j1>ec)&&j1<w)
				ar[i][j]+=ar[i][j1]%mod;
				ar[i][j]%=mod;
			}
		}
		System.out.println(ar[0][0]);
	}
}
