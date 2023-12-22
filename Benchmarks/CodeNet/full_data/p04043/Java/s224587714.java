import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		int[] count = new int[10 + 1];

		for(int i = 0; i < 3; i++) {
			int len = sc.nextInt();
			count[len]++;
		}

		System.out.println(count[5] == 2 && count[7] == 1 ? "YES" : "NO");
	}

}
