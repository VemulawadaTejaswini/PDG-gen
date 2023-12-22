import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();
		long res = 0;
		for (int i=1; i<=N; i++) {
			res = (long)Math.pow(100, D)*i;
		}
		System.out.println(res);
	}
}
