import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] p = new int[n];
		int min = 100;
		List<Integer> xlist = new ArrayList<>();
		List<Integer> ylist = new ArrayList<>();
		List<Integer> zlist = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
			if (p[i] <= a) {
				xlist.add(p[i]);
			} else if (p[i] <= b) {
				ylist.add(p[i]);
			} else {
				zlist.add(p[i]);
			}
		}
		min = Math.min(Math.min(xlist.size(), ylist.size()), zlist.size());
		System.out.println(min);
	}
}
