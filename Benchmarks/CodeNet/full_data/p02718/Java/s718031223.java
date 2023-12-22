import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		Integer a[] = new Integer[n];

		int total = 0;
		for (int i=0; i< n; i++){
			a[i] = sc.nextInt();
			total += a[i];
		}
		int minVote = total / (4 * m);
		Arrays.sort(a, Collections.reverseOrder());
		boolean result = true;
		for (int i=0; i<m; i++){
			if (a[i] < minVote){
				result = false;
				break;
			}
		}
		if (result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}