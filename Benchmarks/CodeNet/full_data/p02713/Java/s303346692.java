import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(in.readLine());
		long sum = 0;
		for (int i = 1; i <= K; i++) 
		for (int j = 1; j <= K; j++)
		for (int u = 1; u <= K; u++)
			if (i == j  && j == u)
				sum += i;
			else if (i == j || i == u || j == u)
				sum += 3 * gcd(i,j,u);
			else
				sum += 6 * gcd(i, j, u);
		
		System.out.println(sum);
	}
	public static int gcd(int a, int b, int c) {

		if (b == 0 && c == 0)
			return a;
		if (c == 0) {
			int a1 = a % b;
			int b1 = b;
			return gcd(b1, a1, c);
		}
		
		int a1 = Math.min(a % c, a % b);
		int b1 = b % c;
		
		if (a1 >= b1)
			return gcd(c, a1, b1);
		else
			return gcd(c, b1, a1);
			
	}
}
