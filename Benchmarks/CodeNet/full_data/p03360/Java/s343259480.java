import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] n = new int[3];
		for (int i = 0; i < 3; i++) {
			n[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		Arrays.sort(n);
		for (int i = 0; i < k; i++) {
			n[2] *= 2;
		}
		int a = 0;
		for (int i = 0; i < 3; i++) {
			a += n[i];
		}
		System.out.println(a);
	}
}
