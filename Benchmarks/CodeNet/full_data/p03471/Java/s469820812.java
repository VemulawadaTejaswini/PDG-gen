import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		Y /= 1000;
		sc.close();
		for(int i = 0; i <= N; i++) {
			for(int j = 0; j <= N; j++) {
				if(i + j > N) break;
				int k = N - (i + j);
				int t = i + 5 * j + 10 * k;
				if(t == Y) {
					System.out.println(k + " " + j + " " + i);
					System.exit(0);
				}
			}
		}
		System.out.println("-1 -1 -1");
	}
}