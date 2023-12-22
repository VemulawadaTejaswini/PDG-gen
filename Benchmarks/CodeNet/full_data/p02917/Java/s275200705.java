import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] b = new int[n - 1];
		Arrays.setAll(b, i -> sc.nextInt());
		
		int[] a = new int[n];
		a[0] = b[0];
		a[n - 1] = b[n - 2];
		for (int i = 1; i < n - 1; i++) {
			a[i] = Math.min(b[i - 1], b[i]);
		}
		
		int sum = Arrays.stream(a).sum();
		
		System.out.println(sum);
	}
}
