import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		List<Integer> ans = new ArrayList<Integer>();
		switch (a) {
		case 1:
			ans.add(b);
			break;
		default:
			for (int i = 0; i < 2; i++) {
				int max = b + a - 1;
				int min = b - a + 1;
				for (int l = b; l <= max; l++) {
					if (!ans.contains(l)) {
						ans.add(l);
					}
				}
				for (int l = b; l >= min; l--) {
					if (!ans.contains(l)) {
						ans.add(l);
					}
				}
			}
		}
		Collections.sort(ans);
		for (int i : ans) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
