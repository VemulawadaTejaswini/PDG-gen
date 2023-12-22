import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long N = sc.nextLong();
		for(int h = 1 ; h <= 3500 ; h++) {
			for(int n = 1 ; n <= 3500 ; n++) {
				if(4 * h * n > N * (n + h)) {
					if(N * h * n % (4 * h * n - N * (n + h)) == 0) {
						System.out.println(h + " " + n + " " + N * h * n / (4 * h * n - N * (n + h)));
						return;
					}
				}
			}
		}
	}
}