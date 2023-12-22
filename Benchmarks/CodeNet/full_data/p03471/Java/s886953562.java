import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();
		for(int i = 0 ; i <= n ; i++) {
			for(int j = 0 ; i + j <= n ; j++) {
				int k = n - (i + j);
				if(k >= 0 && 10000 * i + 5000 * j + 1000 * k == y) {
					System.out.println(i + " " + j + " " + k);
					return;
				}
			}
		}
		System.out.println(-1 + " " + -1 + " " + -1);
	}
}
