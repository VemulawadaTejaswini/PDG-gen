import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] n = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		Arrays.sort(n);

		System.out.println(10 * n[2] + n[1] + n[0]);
	}

}