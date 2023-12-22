import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int max = 1;
		int max1 = 1;
		for (int i = n; i > 1; i-- ) {
			int n_i = calc(i);
			if (max1 <= n_i) { 
				max = i;
				max1 = n_i;
			}
		}
		System.out.println(max);
		
	}
	public static int calc(int n) {
		if (n % 2 == 0) return 1 + calc(n / 2);
		else return 0;
	}
}