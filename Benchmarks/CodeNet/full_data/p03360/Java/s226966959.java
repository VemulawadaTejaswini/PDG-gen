import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();

		int d = Math.max(a, Math.max(b, c));
		if (d == a) {
			for(int i = 0;i < k; i++) {
				d *= 2;
			}
			System.out.println(d + b + c);
		}else if (d == b) {
			for(int i = 0;i < k; i++) {
				d *= 2;
			}
			System.out.println(d + a + c);
		}else {
			for(int i = 0;i < k; i++) {
				d *= 2;
			}
			System.out.println(d + a + b);
		}
	}
}
