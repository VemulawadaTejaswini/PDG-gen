import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		List<int[]> a = new ArrayList<int[]>(n);
		for (int i = 0; i < n; i++) {
			int[] anum = { Integer.parseInt(sc.next()), Integer.parseInt(sc.next()) };
			a.add(anum);
		}
		List<int[]> b = new ArrayList<int[]>(n);
		for (int i = 0; i < n; i++) {
			int[] bnum = { Integer.parseInt(sc.next()), Integer.parseInt(sc.next()) };
			b.add(bnum);
		}
		Collections.sort(a, new xsort());
		Collections.sort(b, new ysort());
		//		for(int []tmp:a) {
		//			System.out.println("("+tmp[0]+","+tmp[1]+")");
		//		}
		//		System.out.println();
		//		for(int []tmp:b) {
		//			System.out.println("("+tmp[0]+","+tmp[1]+")");
		//		}
		int cnt = 0;
		int x, y;
		for (int i = n - 1; i >= 0; i--) {
			x = a.get(i)[0];
			y = a.get(i)[1];
			//	System.out.println("a"+x+","+y);
			for (int j = 0; j < b.size(); j++) {
				if (x < b.get(j)[0] && y < b.get(j)[1]) {
					//			System.out.println("b"+b.get(j)[0]+","+b.get(j)[1]);
					b.remove(j);
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}

class xsort implements Comparator<int[]> {
	@Override
	public int compare(int[] a, int[] b) {
		return a[0] > b[0] ? 1 : -1;
	}
}

class ysort implements Comparator<int[]> {
	@Override
	public int compare(int[] a, int[] b) {
		return a[1] > b[1] ? 1 : -1;
	}
}
