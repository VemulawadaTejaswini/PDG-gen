import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int k = sc.nextInt();
		for (int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
		int max = 0;
		for (int i = 4; i > 0; i--) {
			max = Math.max(max, a[i]-a[i-1]);
		}
		System.out.println((max>k)?"Yay!":":(");
		sc.close();
	}
}