import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		
		a += x - (a % x);
		long cnt = (b - a) / x + 1;
		
		System.out.println(cnt);
	}
}