import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String line = in.readLine();
		StringTokenizer tk = new StringTokenizer(line);
		System.out.println(solve(Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken())));

		out.close();
		in.close();
	}

	static int solve(int x, int y) {
		if (x >= 0 && y >= 0)
			if(x>y)
				return Math.abs(x - y)+2;
			else return Math.abs(x - y);
		if (x >= 0 && y < 0)
			return Math.abs(x - Math.abs(y)) + 1;
		if (x < 0 && y >= 0)
			return Math.abs(Math.abs(x) - Math.abs(y)) + 1;
		if (x < 0 && y < 0)
			return 2 + Math.abs(Math.abs(x) - Math.abs(y));
		else
			return Math.abs(x - y) + 1;
	}
}
