import java.io.PrintWriter;
import java.util.Scanner;

public class Main
{
	static Scanner in;
	static PrintWriter out;
	static void solve()
	{
		int N = in.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++)
		{
			a[i] = in.nextInt();
		}
		int sum = 0;
		int sumi = 0;
		for(int i = 0; i < N; i++)
		{
			if(a[i] % 2 == 1)
			{
				sum += 1;
			}
			if(a[i] % 4 == 0)
			{
				sumi += 1;
			}
		}
		out.println(sum);
		out.println(sumi);
		if(N % 2 == 1)
		{
			if(sumi + 1 < sum)
			{
				out.print("No");
			}
			else
			{
				out.print("Yes");
			}
		}
		else
		{
			if(sumi < sum)
			{
				out.print("No");
			}
			else
			{
				out.print("Yes");
			}
		}
	}
	public static void main(String[] args)
	{
		in = new Scanner(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
		out.close();
		in.close();
	}
}