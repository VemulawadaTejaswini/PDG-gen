import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long x = scan.nextLong();
		long n = b/x;
		long m;
		if (a!=0) {
			if (a%x==0) {				
				m = a/x-1;
			} else {
				m = a/x;
			}
		} else {
			m = -1;
		}
		long c = n-m;
		System.out.println(c);
	}
}
