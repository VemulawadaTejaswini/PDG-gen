import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String k = "YES";
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int j = kb.nextInt();
			a[i] = j;
		}
		for (int count = 0; count < n; count++) {
			for (int i = count; i < n - 1; i++) {
				if (a[count] == a[i + 1]) {
					k = "NO";
					break;
				}
			}
			if (k == "NO")
				break;
		}
		System.out.println(k);
		kb.close();
	}
}
