import java.awt.Point;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<KUSO> ts = new TreeSet<>();
		for(int i = 0; i < n; i++) {
			ts.add(new KUSO(new Point(sc.nextInt(),sc.nextInt()), true));
		}
		for(int i = 0; i < n; i++) {
			ts.add(new KUSO(new Point(sc.nextInt(),sc.nextInt()), false));
		}
		Iterator<KUSO> itr = ts.iterator();
		TreeSet<Integer> treeone = new TreeSet<>();
		long count = 0;
		while(itr.hasNext()) {
			KUSO k = itr.next();
			if(k.isRed) {
				treeone.add(k.p.y);
			} else {
				if(treeone.floor(k.p.y)!=null) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
class KUSO implements Comparable<KUSO>{
	Point p;
	boolean isRed;
	KUSO(Point p, boolean b) {
		this.p = p;
		this.isRed = b;
	}
	@Override
	public int compareTo(KUSO o) {
		return Integer.compare(this.p.x, o.p.x);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof KUSO) {
			KUSO kuso = (KUSO) obj;
			if(kuso.p.equals(this.p)&&kuso.isRed==this.isRed) {
				return true;
			}
		}
		return false;
	}
}
