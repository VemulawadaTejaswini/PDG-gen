import java.io.PrintWriter; 
import java.util.Scanner; 

public class Main
{
	static Scanner in; 
	static PrintWriter out; 

	static void solve()
	{
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int T = stdIn.nextInt();
		int A = stdIn.nextInt();
		int[] H = new int[N];
		int answer = 1;
		int i = 0;
		for(i = 0; i < N; i++)
		{
			if(i = 0)
				near_A = Math.abs(A - (T - (H[0] * 0.006)))
			H[i] = stdIn.nextInt();
			if(Math.abs(A - (T - (H[i] * 0.006))) < near_A)
			{
				near_A = Math.abs(A - (T - (H[i] * 0.006)));
				answer = i + 1;
			}
		}			
		System.out.println(answer);
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