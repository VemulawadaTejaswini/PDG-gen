
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

		int n = Integer.valueOf(inputArray[0]);
//		for (int z=1; z<20; z++){
//			sb.append(z+":\n");
//			int n=z;
		while(n>0){
			int i = (int)((Math.sqrt(8*n+1)-1)/2+0.99999);
			sb.append(i+"\n");
			n-=i;
		}
//		sb.append("\n");
//		}
		ln(sb);
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	public static void ln(Object obj) {
		out.print(obj);
	}
}
