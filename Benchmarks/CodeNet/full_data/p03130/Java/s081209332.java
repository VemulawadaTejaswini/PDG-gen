import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] a = new int[6];
//	static int[] b = new int[3];
	static int[] town = new int[5];
	public static void main(String[] args) {
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(sc.next());
//			b[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(a);
		for (int i : a) {
			town[i]++;
		}
		boolean ans = true;
		for (int i : town) {
			if (i == 3) {
				ans = false;
			}
		}
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(town));
		if (ans) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}