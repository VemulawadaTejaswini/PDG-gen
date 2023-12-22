import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long a = scn.nextLong();
		long b = scn.nextLong();
		System.out.println(f(b) ^ f(a-1));
		scn.close();
	}
	static long f(long x) {
	    if (x % 4 == 0)return x;
	    else if (x % 4 == 1)return x^(x-1);
	    else if (x % 4 == 2)return x^(x-1)^(x-2);
	    else return 0;
	}
}