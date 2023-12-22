import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int l = in.nextInt();

		int min = Integer.MAX_VALUE;
		int minI = 0;

		for ( int i = 1; i <= n; i++ ) {
			if ( min > Math.abs(l + i - 1) ) {
				min = Math.abs(l + i - 1);
				minI = i;
			}
		}
		
		int sum = 0;
		for ( int i = 1; i <= n; i++ ) {
			if ( i != minI ) {
				sum += l + i -1;
			}
		}
		
		System.out.println(sum);
		in.close();
	}
}