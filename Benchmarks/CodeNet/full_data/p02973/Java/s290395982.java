import java.util.*;
import java.util.stream.*;
 
public class Main {
	Scanner sc;
	
	int N;
	int[] a;
	int color;
	
	List<Node> g;
	
	private static class Node {
		int left;
		int right;
		int value;
		int index;
		
		private Node(int index, int value) {
			this.index = index;
			this.value = value;
			this.left = -1;
			this.right = -1;
		}
		
		public String toString() {
			return "(l,r)=("+left+","+right+")(i,val)=("+index+","+value+")/";
		}
	}
	
//=============
// constructor
//
	public Main() {
		sc = new Scanner(System.in);
	}
	
//==================
// instance methods
//
	private void input() {
		N = sc.nextInt();
		a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
	}
	
	private void output() {
		out(color);
	}
	
	private void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
	/**
	 * 計算本体
	 */
	private void calc() {
		g = new ArrayList<Node>();
		for (int i = 0; i < N; i++) {
			g.add(new Node(i, a[i]));
		}
		// (値, 添え字逆) で降順にソートする
		Comparator<Node> c = Comparator.comparingInt(n -> -n.value);
		Comparator<Node> cc = c.thenComparingInt(n -> -n.index);
		
		g.sort( cc );
		
		// g の組み合わせを見つけていく
		color = N;
		for (int i = 0; i < N; i++) {
			int v = g.get(i).value;
			for (int j = i+1; j < N; j++) {
				if (g.get(j).value == v) continue; // 同じ値はだめ
				if (g.get(i).index < g.get(j).index) continue; // index 増えるのはだめ
				if (g.get(j).right > -1) continue; // すでにつながってるのはだめ
				// 見つかった j--i
				g.get(i).left = g.get(j).index;
				g.get(j).right = g.get(i).index;
				color--;
				break;
			}
		}
		
		//g.stream().forEach(System.out::println);
	}
	
//======
// main
//
	public static void main(String[] args) throws Exception {
		Main m = new Main();
		m.input();
		m.calc();
		m.output();
	}
}
