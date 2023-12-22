import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int h = sc.nextInt();
			if (min > h) {
				min = h;
			}
			list.add(h);
		}
		System.out.println(count(list, min) + min);
	}
	
	static int count(ArrayList<Integer> list, int min) {
		ArrayList<Integer> nlist = new ArrayList<>();
		int nmin = Integer.MAX_VALUE;
		int total = 0;
		for (int i = 0; i < list.size(); i++) {
			int x = list.get(i);
			if (x == min) {
				if (nlist.size() != 0) {
					total += count(nlist, nmin) + nmin - min;
					nlist = new ArrayList<>();
					nmin = Integer.MAX_VALUE;
				}
			} else {
				nlist.add(x);
				if (nmin > x) {
					nmin = x;
				}
				if (i == list.size() - 1) {
					total += count(nlist, nmin) + nmin - min;
				}
			}
		}
		return total;
	}
}
