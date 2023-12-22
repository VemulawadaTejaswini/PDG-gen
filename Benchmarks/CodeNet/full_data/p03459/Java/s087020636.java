import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(in.readLine());
		boolean okay = true;
		int t = 0;
		int x = 0;
		int y = 0;
		while(m-- > 0) {
			String[] r = in.readLine().split("\\s++");
			int tn = Integer.parseInt(r[0]);
			int xn = Integer.parseInt(r[1]);
			int yn = Integer.parseInt(r[2]);
			int dx = xn - x;
			int dy = yn - y;
			int dt = tn - t;
			if(dx < 0) dx = -dx;
			if(dy < 0) dy = -dy;
			int rem = dt - (dx + dy);
			if(rem < 0 || rem % 2 != 0) okay = false;
			t = tn;
			x = xn;
			y = yn;
		}
		System.out.println(okay ? "Yes" : "No");
	}
}