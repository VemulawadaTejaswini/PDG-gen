import java.io.PrintWriter;
import java.util.Scanner;

public class Main
{
	static Scanner in;
	static PrintWriter out;
	static void solve()
	{
		String str = in.nextLine();
		int n = str.length();
		out.print(str.charAt(0));
		out.print(n - 2);
		out.println(str.charAt(n - 1));
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