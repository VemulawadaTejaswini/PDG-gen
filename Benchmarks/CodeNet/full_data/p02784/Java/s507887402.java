import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int n = scan.nextInt();
		int[] a = new int[n];

		int sum = 0;
		for(int i = 0; i < n ; i++) {
			a[i] = scan.nextInt();
			sum += a[i];
			if(sum >= 1_000_000_000) {
				break;
			}
		}


		String ans = "Yes";
		if(sum < h) {
			ans = "No";
		}


		System.out.println(ans);

	}

}