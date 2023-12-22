import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		int max = 0;
		for(int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
			max += num[i];
		}
		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			System.out.println(max - num[sc.nextInt()-1] + sc.nextInt());
		}
	}
}