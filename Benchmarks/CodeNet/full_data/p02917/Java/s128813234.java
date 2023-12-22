import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int b[] = new int[n - 1];
		for ( int i = 0; i < n - 1; i++ ) {
			b[i] = in.nextInt();
		}

		int sum = 0;
		sum += b[0];
		sum += b[n - 2];
		
		for(int i = 1; i <= n-2; i++) {
			sum += Math.min(b[i], b[i-1]);
		}
		
		System.out.println(sum);

		in.close();

	}
}