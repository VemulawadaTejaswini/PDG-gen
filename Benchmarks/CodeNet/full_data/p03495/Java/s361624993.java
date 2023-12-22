import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		List<Integer> a = new ArrayList<Integer>();
		int c[] = new int[n];
		int i = 0;
		for (int j = 0; j < n; j++) {
			int b = Integer.parseInt(sc.next());
			int index = a.indexOf(b);
			if (index != -1)
				c[index] += 1;
			else {
				a.add(b);
				c[i++] = 1;
			}
		}
		Arrays.sort(c, 0, i);
		int ans = 0;
		for (int j = 0; j < a.size() - k; j++) {
			ans += c[j];
		}
		System.out.println(ans);
	}
}