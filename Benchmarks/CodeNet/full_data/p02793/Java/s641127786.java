import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int a[] = new int[n];
		long pre = Integer.parseInt(st.nextToken());
		n--;
		a[n] = (int) pre;
		while(n-->0) {
			a[n] = Integer.parseInt(st.nextToken());
			pre = lcm(a[n],pre);
		}
		int cnt = 0;
		for(int e:a) {
			cnt = (int) ((cnt+pre/e)%(1e9+7));
		}
		out.println(cnt);
		out.flush();
	}
	static long gcd(long n, long m) {
		if(n == 0)
			return m;
		return gcd(m % n, n);
	}
	static long lcm(long n, long m) {
		return (n*m)/gcd(n, m);
	}
}
