import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long h = scan.nextLong();
		int n = scan.nextInt();
		int[] a = new int[n];
		int total = 0;

		for(int i=0;i<n;i++) {

			a[i] = scan.nextInt();
			total += a[i];
		}

		System.out.println(total >= h?"Yes":"No");

		scan.close();


	}

}
