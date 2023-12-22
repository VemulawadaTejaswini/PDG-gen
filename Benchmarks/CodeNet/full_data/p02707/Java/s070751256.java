import java.util.Scanner;

public class Main {
	public static void main(String[] rags) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] list = new int[n];

		for(int i =0;i < n - 1;i++) {
			list[scan.nextInt() - 1] += 1;
		}

		for(int i = 0;i < n;i++) {
			System.out.println(list[i]);
		}
	}
}
