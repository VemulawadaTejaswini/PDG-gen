import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int res = 1;
		for (int i=0; i<N; i++) {
			res = Math.min(res*2, res+K);
		}
		System.out.println(res);
	}
}
