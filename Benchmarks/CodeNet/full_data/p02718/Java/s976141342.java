import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
		int vote = 0;
		int[] a = new int[n];

		for(int i = 0; i < n; i++) {
			int j = sc.nextInt();
			a[i] = j;
			vote += j;
		}

		for(int i = 0; i < n; i++) {
			if(a[i] * 4 * m >= vote) {
				sum++;
			}
		}

		if(sum >= m) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}
