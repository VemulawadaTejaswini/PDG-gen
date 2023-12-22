import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		long sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (s.charAt(j) == s.charAt(i)) {
					continue;
				}
				for (int k = j+1; k < n; k++) {
					if (s.charAt(k) == s.charAt(i) || s.charAt(k) == s.charAt(j)) {
						continue;
					}
					if (k-j == j-i) {
						continue;
					}
					sum++;
				}
			}
		}
		System.out.println(sum);
	}

}
