import java.util.*;
import java.io.*;

public class Main {
	static int gcd (int a, int b) {
	    return b == 0 ? a : gcd (b, a % b);
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println((2*n)/gcd(2,n));
	}
}