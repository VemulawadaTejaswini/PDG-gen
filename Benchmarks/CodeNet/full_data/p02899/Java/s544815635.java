import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			b[a[i] - 1] = i + 1;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
	}
}