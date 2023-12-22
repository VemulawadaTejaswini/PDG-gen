import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[100001]; for(int i = 0; i < n; i++) a[sc.nextInt()]++;
		int max = 0;
		for(int i = 0; i+2 < 100001; i++) {
			max = Math.max(max, a[i]+a[i+1]+a[i+2]);
		}
		System.out.println(max);
		sc.close();
	}
}