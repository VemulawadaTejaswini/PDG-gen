
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static final long INF = Integer.MAX_VALUE;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int n=sc.nextInt();

		if(x1==x2) {
			int count=0;
			for(int i=0;i<n;i++) {
				int x=sc.nextInt();
				int y=sc.nextInt();
				if(x==x1 && between(y1,y2,y)) {
					count++;
				}
			}
			System.out.println(100*Math.abs(y2-y1)+(10*Math.PI-20)*count);
		} else if(y1==y2) {
			int count=0;
			for(int i=0;i<n;i++) {
				int x=sc.nextInt();
				int y=sc.nextInt();
				if(y==y1 && between(x1,x2,x)) {
					count++;
				}
			}
			System.out.println(100*Math.abs(x2-x1)+(10*Math.PI-20)*count);

		} else {
			PriorityQueue<Fountain> q=new PriorityQueue<Fountain>(
					new Comparator<Fountain>() {
						public int compare(Fountain f1, Fountain f2) {
							return(int)(f1.d-f2.d);
						}
					}
				);
			q.add(new Fountain(x1,y1));
			Fountain t=new Fountain(x2,y2,n);
			q.add(t);

			for(int i=0;i<n;i++) {
				int x=sc.nextInt();
				int y=sc.nextInt();
				if(between(x1,x2,x) & between(y1,y2,y)) {
					q.add(new Fountain(x,y,i));
				}
			}

			ArrayList<Fountain> listX = new ArrayList<Fountain>(q);
			ArrayList<Fountain> listY = new ArrayList<Fountain>(q);

			java.util.Collections.sort(listX, new Comparator<Fountain>() {
				public int compare(Fountain f1, Fountain f2) {
					return (int)(f1.x-f2.x);
				}
			});

			if(x1>x2) {
				java.util.Collections.reverse(listX);
			}

			java.util.Collections.sort(listY, new Comparator<Fountain>() {
				public int compare(Fountain f1, Fountain f2) {
					return (int)(f1.y-f2.y);
				}
			});

			if(y1>y2) {
				java.util.Collections.reverse(listY);
			}

			while(!q.isEmpty()) {
				Fountain u = q.poll();
				ListIterator<Fountain> iteratorX = listX.listIterator(listX.indexOf(u));
					while(iteratorX.hasNext()) {
					Fountain v = iteratorX.next();
					double alt = u.d+distance(u,v,x1<x2,y1<y2);
					if(v.d>alt) {
						v.d=alt;
						v.prev=u;
					}
				}

			}

			System.out.println(t.d+20-Math.PI*5);

		}


	}

	static double distance(Fountain from, Fountain to, boolean xSign, boolean ySign) {
		//xSign: x正方向に進む
		if(from.no==to.no) {
			return 0;
		}
		if(to.x - from.x>0 ^ xSign) {
			return INF;
		}
		if(to.y - from.y>0 ^ ySign) {
			return INF;
		}
		return 100*(Math.abs(to.x-from.x)+Math.abs(to.y-from.y))-20+Math.PI*5;
	}
	static boolean between(int a, int b, int mid) {
		return (a<mid && mid<b) || (b<mid && mid<a);
	}
}

class Fountain {
	int x;
	int y;
	int no;
	double d;
	Fountain prev;

	Fountain (int x, int y, int no) {
		this.x=x;
		this.y=y;
		this.no=no;
		this.d=Main.INF;
	}
	Fountain (int x, int y) {
		this.x=x;
		this.y=y;
		this.no=-1;
		this.d=0;
	}

}

