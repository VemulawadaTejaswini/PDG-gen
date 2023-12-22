
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int[][] memo;

	public static int hoge(int current, int n, String last) {
		return 0;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		long a,b,c,d,e,n,ans = 0;
		String str;
		str = bf.readLine();
		n = Long.parseLong(str);
		str = bf.readLine();
		a = Long.parseLong(str);
		long temp = a;
		str = bf.readLine();
		b = Long.parseLong(str);
		if(temp > b) {
			temp = b;
		}
		str = bf.readLine();
		c = Long.parseLong(str);
		if(temp > c) {
			temp = c;
		}
		str = bf.readLine();
		d = Long.parseLong(str);
		if(temp > d) {
			temp = d;
		}
		str = bf.readLine();
		e = Long.parseLong(str);
		if(temp > e) {
			temp = e;
		}
		ans = n/temp + 5;
		System.out.println(ans);
	}
}