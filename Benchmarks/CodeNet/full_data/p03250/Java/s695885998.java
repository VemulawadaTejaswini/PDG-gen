import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] i = new int[3];

		i[0] = sc.nextInt();
		i[1] = sc.nextInt();
		i[2] = sc.nextInt();

		Arrays.sort(i);

		System.out.print(i[2]*10+i[1]+i[0]);

	}
}