import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int x = scan.nextInt();
		int[] array = new int[m];

		int left = 0;
		int right = 0;
		for (int i = 0; i < m; i++) {
			array[i] = scan.nextInt();
			if(array[i] < x) {
				left++;
			} else {
				right++;
			}
		}
		System.out.println(Math.min(left, right));
	}
}