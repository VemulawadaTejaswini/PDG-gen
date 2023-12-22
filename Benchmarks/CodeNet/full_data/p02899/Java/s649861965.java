import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int order[] = new int[n + 1];
		for ( int i = 1; i <= n; i++ ) {
			order[in.nextInt()] = i;
		}
		
		for ( int i = 1; i <= n; i++ ) {
			System.out.print(order[i] + " ");
		}
		in.close();
	}
}