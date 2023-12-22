import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String str = sc.next();
		char[] op = new char[q];
		boolean[] left = new boolean[q];
		Arrays.fill(left, false);
		for (int i = 0; i < q; i++) {
			op[i] = sc.next().charAt(0);
			if(sc.next().charAt(0) == 'L') {
				left[i] = true;
			}
		}
		int firstCount = n;
		int[] golem = new int[n];
		Arrays.fill(golem, 1);
		for (int i = 0; i < q; i++) {
			char target = op[i];
			for (int j = 0; j < n; j++) {
				char tmp = str.charAt(j);
				if (golem[j] > 0 && target == tmp) {
					int move = golem[j];
					golem[j] = 0;
					if (left[i]) {
						if (j - 1 >= 0) {
							golem[j - 1] += move;
						} else {
							firstCount -= move;
						}
					} else {
						if (j + 1 < n) {
							golem[j + 1] += move;
						} else {
							firstCount -= move;
						}
					}
				}
			}
		}
		
		System.out.println(firstCount);
	}
}
