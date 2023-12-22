import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		int a = (int)(A / 0.08);
		int b = (int)(B / 0.10);
		if(a == b) {
			System.out.println(a);
			return;
		}
		int max = a;
		double p = 0.10;
		int x = B;
		if(a < b) {
			max = b;
			p = 0.08;
			x = A;
		}
		int r = (int)(max * p);
		if(x == r) {
			System.out.println(max);
			return;
		}
		for(int i = max + 1; i <= 1000000; i++) {
			int aa = (int)(i * 0.08);
			int bb = (int)(i * 0.10);
			if(aa == A && bb == B) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
}