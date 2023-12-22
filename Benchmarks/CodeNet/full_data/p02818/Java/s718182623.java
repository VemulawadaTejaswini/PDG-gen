import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		long n  = k;
		
		if(a >= 1) {k -= a; a = Math.max(0, a-n+1); }
		if(b >= 1) { b = Math.max(0, b-k);}
		System.out.println(a + " " + b);
	}
}
		


