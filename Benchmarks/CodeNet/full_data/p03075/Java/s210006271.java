import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		int k = Integer.parseInt(sc.next());

		String ans = "Yay!";
		if (a[4] - a[0] > k)
			ans = ":(";
		System.out.println(ans);

	}

}
