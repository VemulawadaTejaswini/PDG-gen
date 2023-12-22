import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var a = new int[n];
		for (var i = 0; i < n - 1; i++) {
			a[sc.nextInt() - 1]++;
		}
		sc.close();

		for (var i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}