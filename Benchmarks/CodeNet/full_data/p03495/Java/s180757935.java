import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(sc.next());
		Arrays.sort(a);
		List<Integer> b = new ArrayList<Integer>();
		List<Integer> c = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (b.contains(a[i]))
				c.set(c.size() - 1, c.get(c.size() - 1) + 1);
			else {
				b.add(a[i]);
				c.add(1);
			}
		}
		Collections.sort(c);
		int ans = 0;
		for (int i = 0; i < b.size() - k; i++) {
			ans += c.get(i);
		}
		System.out.println(ans);
	}
}