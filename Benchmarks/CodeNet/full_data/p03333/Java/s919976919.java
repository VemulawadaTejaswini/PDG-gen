import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Interval> a = new TreeSet<Interval>(Comparator.comparing(Interval::getLeft).thenComparing(Interval::getId));
		TreeSet<Interval> b = new TreeSet<Interval>(Comparator.comparing(Interval::getRight).thenComparing(Interval::getId));
		TreeSet<Interval> c = new TreeSet<Interval>(Comparator.comparing(Interval::getLeft).thenComparing(Interval::getId));
		TreeSet<Interval> d = new TreeSet<Interval>(Comparator.comparing(Interval::getRight).thenComparing(Interval::getId));
		
		for (int i=0;i<n;i++) {
			Interval tmp = new Interval();
			tmp.setLeft(sc.nextInt());
			tmp.setRight(sc.nextInt());
			tmp.setId(i);
			a.add(tmp);
			b.add(tmp);
			c.add(tmp);
			d.add(tmp);
		}
		int pos = 0;
		long ans1 = 0;
		long ans2 = 0;
		if (a.last().getRight()>0) {
			for (int i=0;i<n;i++) {
				if(i%2==0) {
					Interval next = a.last();
					if (next.getLeft() > pos) {
						ans1 += next.getLeft()-pos;
						pos = next.getLeft();
					}
					a.remove(next);
					b.remove(next);
				} else {
					Interval next = b.first();
					if (next.getRight() < pos) {
						ans1 += pos-next.getRight();
						pos = next.getRight();
					}
					a.remove(next);
					b.remove(next);
				}
			}
			ans1 += Math.abs(pos);
		}
		
		pos = 0;
		
		if (d.first().getLeft()<0) {
			for (int i=0;i<n;i++) {
				if(i%2==1) {
					Interval next = c.last();
					if (next.getLeft() > pos) {
						ans2 += next.getLeft()-pos;
						pos = next.getLeft();
					}
					c.remove(next);
					d.remove(next);
				} else {
					Interval next = d.first();
					if (next.getRight() < pos) {
						ans2 += pos-next.getRight();
						pos = next.getRight();
					}
					c.remove(next);
					d.remove(next);
				}
			}
			ans2 += Math.abs(pos);
		}
		
		
		System.out.println(Math.max(ans1, ans2));

	}

}

class Interval {
	int left;
	int right;
	int id;

	
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
