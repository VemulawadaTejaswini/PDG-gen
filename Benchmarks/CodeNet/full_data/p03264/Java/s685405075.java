import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int e = 0;
		int o = 0;
		for (int i = 1; i <= K; i++) {
			if (i%2==0) {
				e++;
			} else {
				o++;
			}
		}
		System.out.println(e*o);
	}
}
