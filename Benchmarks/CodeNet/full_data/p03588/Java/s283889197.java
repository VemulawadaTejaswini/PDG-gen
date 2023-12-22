import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	void	 solve() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<P> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(new P(in.nextInt(), in.nextInt()));
		}
		if(n == 1) {
			System.out.println(list.get(0).a + list.get(0).b);
			return;
		}
		list.sort(new Comparator<P>() {
			public int compare(P p1, P p2){
				return p1.a > p2.a ? 1 : -1;
			}
		});
		long sum = 0;
		int beforeA = 0, beforeB = 0;
		for(int i = 0; i < list.size(); i++) {
			P l = list.get(i);
			if(i == 0) {
				sum += l.a;
			}else if(i == list.size() - 1) {
				sum += Math.min(l.a - beforeA, beforeB - l.b);
				sum += l.b;
			}else {
				sum += Math.min(l.a - beforeA, beforeB - l.b);
				//System.out.println((l.a - beforeA) + ":" + (beforeB - l.b));
				//System.out.println(beforeB);
			}
			beforeA = l.a; beforeB = l.b;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) throws Exception{
		new Main().solve();
	}
}
class P{
	int a, b;
	public P(int a, int b) {
		this.a = a;
		this.b = b;
	}
}