import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int l = sc.nextInt();
		int ans = 0;
		int abs = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			ans += i + l;
			if (Math.abs(abs) >= Math.abs(i + l)) {
				abs = i + l;
			}
		}
		System.out.println(ans - abs);
	}
}
