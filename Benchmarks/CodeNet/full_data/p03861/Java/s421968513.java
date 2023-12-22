import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		
		long cnt = (b - a) / x;
		if (a % x == 0)
			cnt++;
		
		System.out.println(cnt);
	}
}