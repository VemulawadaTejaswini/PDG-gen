import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int k = sc.nextInt();
		
		long[] a = new long[x];
		long[] b = new long[y];
		long[] c = new long[z];
		
		for (int i = 0; i < x; i++) {
			a[i] = sc.nextLong();
		}
		for (int i = 0; i < y; i++) {
			b[i] = sc.nextLong();
		}
		for (int i = 0; i < z; i++) {
			c[i] = sc.nextLong();
		}
		Cakes cakes = new Cakes(a, b, c, k);
		ArrayList<Long> points = cakes.calcPoints();
		for (int i = 0; i < k; i++) {
			System.out.println(points.get(i));
		}
	}
	
}

class Cakes {
	int k;
	ArrayList<Long> a = new ArrayList<>();
	ArrayList<Long> b = new ArrayList<>();
	ArrayList<Long> c = new ArrayList<>();
	
	Cakes(long[] a, long[] b, long[] c, int k) {
		this.k = k;
		setDecOreder(a, this.a);
		setDecOreder(b, this.b);
		setDecOreder(c, this.c);
	}
	void setDecOreder(long[] longs, ArrayList<Long> list) {
		Arrays.sort(longs);
		int length = longs.length;
		int arySize = Math.min(k, length);
		for (int i = 0; i < arySize; i++) {
			list.add(longs[length - 1 - i]);
		}
	}
	ArrayList<Long> calcPoints() {
		ArrayList<Long> points = new ArrayList<>();
		for (int ia = 0; ia < a.size(); ia++) {
			for (int ib = 0; ib < b.size(); ib++) {
				if ((ia + 1) * (ib + 1) > k) {
					break;
				}
				for (int ic = 0; ic < c.size(); ic++) {
					if ((ia + 1) * (ib + 1) * (ic + 1) > k) {
						break;
					}
					long point = a.get(ia) + b.get(ib) + c.get(ic);
					points.add(point);
				}
			}
		}
		Collections.sort(points, Comparator.reverseOrder());
		return points;
	}
}
