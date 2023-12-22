import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int num = sc.nextInt();
		final int day = sc.nextInt();
		final int remain = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		int result = remain + arr.length;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] <= day) {
				result += day / arr[i];
			}
		}

		System.out.println(remain);
	}

}
