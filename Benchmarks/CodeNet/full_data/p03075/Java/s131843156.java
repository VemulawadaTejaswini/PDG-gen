import java.util.Scanner;

// A - Five Antennas
public class Main {
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println(check(k));

	}
	static String check(int k) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int x = Math.abs(arr[i] - arr[j]);
				if (k < x) {
					return ":(";
				}
			}
		}
		return "Yay!";
	}
}
