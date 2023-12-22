import java.io.PrintWriter; 
import java.util.Scanner; 

public class Main
{
	static Scanner in; 
	static PrintWriter out; 

	static void solve()
	{
		Scanner stdIn = new Scanner(System.in);
		int x_fee = stdIn.nextInt();
		int y_fee = stdIn.nextInt();
		int x = x_fee + (y_fee / 2);
		System.out.println(x);
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