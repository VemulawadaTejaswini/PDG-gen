
import static java.lang.System.in;
import static java.lang.System.out;

import java.io.*;
import java.util.*;

public class Main {
	static final double EPS = 1e-10;
	static final double INF = 1L << 31;
	static final double PI = Math.PI;

	public static Scanner sc = new Scanner(in);
	StringBuilder sb = new StringBuilder();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void run() throws IOException {
		String input;
		String[] inputArray;
		input = br.readLine();
		inputArray = input.split(" ");

		int W = Integer.valueOf(inputArray[0]);
		int H = Integer.valueOf(inputArray[1]);
		int [] p = new int[W];
		int [] q = new int[H];
		long sp = 0L, sq = 0L;
		for (int i=0; i<W; i++){
			p[i] = Integer.valueOf(br.readLine());
			sp+=p[i];
		}
		for (int i=0; i<H; i++){
			q[i] = Integer.valueOf(br.readLine());
			sq+=q[i];
		}
		Arrays.sort(p);
		Arrays.sort(q);		
		long ans = 0;
		int i,j=0;
		for (i=0; i<W; i++){
			while(j<H && p[i]>q[j])
				j++;
			ans+=(1L*j*p[i]);
		}
		i=0;
		for (j=0; j<H; j++){
			while(i<W && q[j]>=p[i])
				i++;
			ans+=(1L*i*q[j]);
		}
		sb.append(sp*(H+1)+sq*(W+1)-ans);
		ln(sb);
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	public static void ln(Object obj) {
		out.println(obj);
	}
}
