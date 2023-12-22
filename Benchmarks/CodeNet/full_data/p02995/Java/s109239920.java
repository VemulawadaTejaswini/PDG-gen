import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
 
 
public class Main {

	static long MOD = 1_000_000_007;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//int N = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());

		Scanner sc = new Scanner(System.in);
		//char[] c = sc.next().toCharArray();
		long A = Long.parseLong(sc.next());
		long B = Long.parseLong(sc.next());
		long C = Long.parseLong(sc.next());
		long D = Long.parseLong(sc.next());
		int INF = Integer.MAX_VALUE;
		int INF_MIN = -1000;//Integer.MIN_VALUE;
		
		long C_mal = B/C - (A-1)/C;
		
		long D_mal = B/D - (A-1)/D;
		
		long CD_mal = B/lcm(C,D) - (A-1)/lcm(C,D);
		
		
		

		System.out.println(B - A + 1 - (C_mal + D_mal - CD_mal));
		
		
	
		
		
	}
	static long lcm (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (c/b);
	}
}

