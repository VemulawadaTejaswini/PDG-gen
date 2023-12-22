import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		double k = (Math.sqrt(1 + 8 * N) - 1) / 2;
		int t = (int) k;
		int s = (t + 1) * t / 2;
		int max = 0;
		if(s >= N) {
			max = t;
		}else {
			max = t + 1;
		}
		if(N - max == 0) {
			System.out.println(max);
		}else {
			System.out.println(N - max);
			System.out.println(max);
		}
	}
}