import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
			while(array[i] % 2 == 0) {
				count++;
				array[i] = array[i] / 2;
			}
		}
		System.out.println(count);
	}
}