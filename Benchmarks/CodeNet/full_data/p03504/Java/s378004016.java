import java.awt.Point;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		TreeSet<Point>[] S = new TreeSet[C];
		for(int i = 0; i < C; i++)
			S[i] = new TreeSet<>((p1,p2)->Integer.compare(p1.x,p2.x));
		for(int i = 0; i < N; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int c = sc.nextInt()-1;
			S[c].add(new Point(s, t));
		}
		int prevs = -1, prevt = -1;
		for(int i = 0; i < C; i++)
			for(Point p : S[i]) {
				if(p.x == prevt) {
					S[i].remove(new Point(prevs, prevt));
					S[i].remove(p);
					S[i].add(new Point(prevs, p.y));
				}
				prevs = p.x;
				prevt = p.y;
			}
		int ans = 0;
		int[] cam = new int[200003];
		for(int i = 0; i < C; i++)
			for(Point p : S[i])
				for(int j = p.x*2; j <= p.y*2+1; j++) {
					cam[j]++;
					ans = Math.max(cam[j], ans);
				}
		System.out.println(ans);
	}

}