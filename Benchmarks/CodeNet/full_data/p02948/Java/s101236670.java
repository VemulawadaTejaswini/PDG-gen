import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Main main = new Main();
		List<Point> list = new ArrayList<Point>();
		for (int i=0;i<N;i++) {
			Point p = main.new Point();
			p.a= sc.nextInt();
			p.b= sc.nextInt();
			list.add(p);
		}
		long sum =0;
		Collections.sort(list);
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int i=0;i<M;i++) {
			set.add(i);
		}
		for (Point p: list) {
			int t = M-p.a;
			if (set.floor(t)!=null) {
				int g = set.floor(t);
				sum +=p.b;
				set.remove(g);
			}
		}
		System.out.println(sum);
	}

	public class Point implements Comparable {
		int a ;
		int b;
		@Override
		public int compareTo(Object o) {
			Point p = (Point)o;
			if (p.b!=this.b) {
				return p.b-this.b;
			}
			return this.a-p.a;
		}
	}
}