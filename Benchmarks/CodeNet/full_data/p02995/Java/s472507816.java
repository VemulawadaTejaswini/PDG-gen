import java.util.*;
public class Main {
	public static long calc(long a, long b, long c) {
		return a-(a/b+a/c-a/lcm(b,c));
	}
	
	public static long lcm (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (long)(c/b);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long A = stdIn.nextLong();
		long B = stdIn.nextLong();
		long C = stdIn.nextLong();
		long D = stdIn.nextLong();
		
		System.out.println(calc(B,C,D)-calc(A-1,C,D));

	}

}