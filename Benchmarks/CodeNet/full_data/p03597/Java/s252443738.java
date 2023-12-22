import java.util.*;
import java.io.*;

public class Main {
	
	int solve(Scanner in, PrintWriter out)
	{
		long n = in.nextLong();
		long k = in.nextLong();
		
		out.println(n*n - k);
			return 0;
			
	}

	void run()
	{
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out)) {
		
			solve(in, out);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

}