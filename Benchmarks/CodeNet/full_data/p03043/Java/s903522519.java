
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr =sc.nextLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int k = Integer.parseInt(arr[1]);
		sc.close();

		double prob = 0.0;
		for(int i = 1; i <= n; i++) {
			if (i < k) {
				int winNum = (int) Math.ceil(Math.log((double)k/i) / Math.log(2));
				prob += Math.pow(0.5, winNum)/n;
			} else {
				prob += 1.0/n;
			}
		}
		System.out.println(prob);
	}
}
