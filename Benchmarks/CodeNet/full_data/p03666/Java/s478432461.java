
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long c = sc.nextInt();
		long d = sc.nextInt();

		long m = n - 1;
		long sub = b - a;

		long min = 0;
		long max = 0;
		for(int i = 0; i < m; i++){
			min = - i * d + (m - i) * c;
			max = - i * c + (m - i) * d;
			if(min <= sub && sub <= max){
				System.out.print("YES");
				return;
			}
			min += 2 * d;
			max += 2 * c;
		}
		System.out.print("NO");
	}
}
