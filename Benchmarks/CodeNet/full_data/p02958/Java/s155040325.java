import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[] arr = new int[n];
		int[] ans = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(sc.next());
			ans[i] = i+1;
		}

		int count = 0;
		for (int i = 0; i < n; i++) {
			if(arr[i] != ans[i]) {
				count++;
			}
		}

		if(count == 0 || count == 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}