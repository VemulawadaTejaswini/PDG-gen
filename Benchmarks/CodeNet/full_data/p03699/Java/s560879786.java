

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[] s = new int[n];
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int sum = 0;

		for (int i = 0; i < n; i++) {
			s[i] = Integer.parseInt(sc.next());
			sum += s[i];
			if (s[i] % 10 != 0)
				arr.add(s[i]);
		}
		Collections.sort(arr);

		if (sum % 10 != 0) {
			System.out.println(sum);
		} else if (arr.isEmpty()) {
			System.out.println(0);
		} else {
			System.out.println(sum - arr.get(0));
		}
	}

}
