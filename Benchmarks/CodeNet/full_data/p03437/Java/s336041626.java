import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		if(x == y) {
			System.out.println(-1);
			return;
		}
		for(long i = x ; i <= 1000000000000000000L ; i += x) {
			if(i % y != 0) {
				System.out.println(i);
				return;
			}
		}
	}
}
