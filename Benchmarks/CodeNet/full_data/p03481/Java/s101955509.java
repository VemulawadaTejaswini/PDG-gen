import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		long x = sc.nextLong();
		long y = sc.nextLong();
		int cnt = 0;
		while (x <= y) {
			cnt++;
			x = x * 2;
		}
		System.out.println(cnt);
	}
}