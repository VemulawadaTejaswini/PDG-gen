import java.util.Scanner;

public class Main {
	static int cnt=0;
	static long s;
	public static void dfs(long x,long y,long z,long w)
	{
		if(y>0&&z>0&&w>0&&x<=s) cnt++;
		if(x*10<s)
		{
			dfs(x*10+3,y+1,z,w);
			dfs(x*10+5,y,z+1,w);
			dfs(x*10+7,y,z,w+1);
		}
		
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		s=in.nextLong();
		dfs(0,0,0,0);
		System.out.println(cnt);
		in.close();
	}
}