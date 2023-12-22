import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] a = new int[3];
		
		for (int i = 0; i <= 3; i++) {
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);
		String concat = Integer.toString(a[0]) + Integer.toString(a[1]);
		int result = Integer.parseInt(concat) + a[2];
		System.out.println(result);
		scan.close();
		return;
	}

}