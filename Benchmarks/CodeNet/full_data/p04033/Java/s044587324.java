
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer toks = new StringTokenizer(in.readLine());
		long a = Integer.parseInt(toks.nextToken());
		long b = Integer.parseInt(toks.nextToken());
		int res = a == 0 ? 0 : a > 0 ? 1 : -1;
		for (long i = a + 1; i <= b; i++) {
			if (i == 0) {
				res = 0;
			} else if (i > 0) {
				if (res == 0) {
					res=0;
				} else if (res > 0) {
					res=1;
				} else {
					res=-1;
				}
			} else {
				if (res == 0) {
					res=0;
				} else if (res > 0) {
					res=-1;
				} else {
					res=1;
				}
			}
		}
		out.println(res==0?"Zero":res>0?"Positive":"Negative");

		out.close();
	}
}
