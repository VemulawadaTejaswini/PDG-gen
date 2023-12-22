import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] l = new int[n];
		int i = 0;
		for(i = 0; i < n; i++) {
			l[i] = scan.nextInt();
		}
		Arrays.sort(l);
		int snake = 0;
		for(i = 1; i <= k; i++) {
			snake = snake + l[n - i];
		}
		System.out.println(snake);
	}
}