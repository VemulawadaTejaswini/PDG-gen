import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int[] cost = new int[3];
		cost[0] = scan.nextInt();
		cost[1] = scan.nextInt();
		cost[2] = scan.nextInt();
		Arrays.sort(cost);

		System.out.println(cost[0] + cost[1]);
	}

}
