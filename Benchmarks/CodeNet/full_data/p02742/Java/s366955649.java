import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long w = sc.nextLong();
		
		long ans = 0;
		for (int i = 0; i < h; i ++) {
			if (i % 2 == 0) {
				ans += (w + 1) / 2;
			} else {
				ans += w / 2;
			}
		}
		System.out.println(ans);
		
		sc.close();
	}
}
