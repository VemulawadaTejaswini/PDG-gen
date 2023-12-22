import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		sc.close();
		System.out.println(func(A - 1) ^ func(B));
	}
	static long func(long n) {
		if(n < 0) return 0;
		if(n % 4 == 0) {
			return n;
		}else if(n % 4 == 1) {
			return 1;
		}else if(n % 4 == 2) {
			return 1 ^ n;
		}else {
			return 0;
		}
	}
}