import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int[] array = new int[] { A, B, C };
		Arrays.sort(array);

		int block = array[0] * array[1];

		System.out.println(array[2] % 2 == 0 ? 0 : block);
	}
}
