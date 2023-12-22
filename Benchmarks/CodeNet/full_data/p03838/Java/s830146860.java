import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String line = in.readLine();
		StringTokenizer tk = new StringTokenizer(line);
		out.println(solve(Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken())));

		out.close();
		in.close();
	}

	static int solve(int x, int y) {
		if (x == y)
			return 0;
		if (x == -y)
			return 1;
		if (x == 0) {
			if (y < 0)
				return Math.abs(y) + 1;
			else
				return Math.abs(y);
		}
		if (y == 0) {
			if (x < 0)
				return Math.abs(x);
			else
				return Math.abs(x) + 1;
		}
		if (x > 0 && y > 0) {
			if (x > y) {
				return x - y + 2;
			} else {
				return y - x;
			}
		}
		if (x < 0 && y < 0) {
			if (x < y) {
				return Math.abs(x - y);
			} else {
				return Math.abs(x - y) + 2;
			}
		}
		if(x>0 && y<0)
			if(x<Math.abs(y)){
				return Math.abs(x-Math.abs(y))+1;
			}else{
				return Math.abs(x-Math.abs(y))+1;
			}
		if(y>0 && x<0){
			if(Math.abs(x)>y){
				//System.out.println("c");
				return (Math.abs(x)-y)+1;
			}else{
				return (y-Math.abs(x))+1;
			}
		}
		return -17;
	}
}
