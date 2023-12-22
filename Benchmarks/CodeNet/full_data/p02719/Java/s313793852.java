import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		long k = scan.nextLong();
		
		long a = n%k;
		long b = k-a;
		
		System.out.println(Math.min(a,b));
	}
}