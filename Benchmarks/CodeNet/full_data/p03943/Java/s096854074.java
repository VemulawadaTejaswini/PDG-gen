import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int[] candyCount = {a, b, c};

		Arrays.sort(candyCount);

		System.out.println(candyCount[0] + candyCount[1] == candyCount[2] ? "YES" : "NO");
	}

}