import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] d = new int[k];
		for (int i = 0; i < k; i++) {
			d[i] = sc.nextInt();
		}
		for (int i = n; ; i++) {
			boolean bre = false;
			String s = String.valueOf(i);
			for (int j = 0; j < k; j++) {
				if (s.contains(String.valueOf(d[j]))) {
					bre = true;
					break;
				}
			}
			if (!bre) {
				System.out.println(i);
				break;
			}
		}
	}
}