import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int a[] = new int[n];
		int xor_sum = 0;
		for ( int i = 0; i < n; i++ ) {
			a[i] = in.nextInt();
			xor_sum = xor_sum ^ a[i];
		}
		
		if(xor_sum == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		

		in.close();
	}
}