

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt(), Q = scn.nextInt();
		GraphWay[] GW = new GraphWay[N];
		int[] C = new int[N];

		for(int i = 0;i < N;i++) {
			GW[i] = new GraphWay();
		}
		for(int i = 0;i < N-1;i++) {
			int a = scn.nextInt()-1, b = scn.nextInt()-1;
			GW[a].add(b);
		}
		for(int i = 0;i < Q;i++) {
			int p = scn.nextInt()-1, c = scn.nextInt();
			C[p] +=c;
		}
		int[] ans = new int[N];
		Queue<Pair> DQ = new ArrayDeque<Pair>();
		DQ.add(new Pair(0,0));
		while(!DQ.isEmpty()) {
			Pair p = DQ.poll();
			int n = p.first;
			int v = p.second + C[n];
			ans[n] += v;
			for(int next:GW[n].getItr()) {
				DQ.add(new Pair(next,v));
			}
		}
		Printer.printArrayLine(ans);

	}

}
class Printer{
	static void printArrayLine(int[] a) {
		int N = a.length;
		for(int i = 0;i < N;i++) {
			System.out.print(a[i] + ((i==N-1)?"\n":" "));
		}
	}
}

class GraphWay{//有向パス
	ArrayList<Integer> to;
	public GraphWay() {
		to = new ArrayList<Integer>();
	}

	void add(int t) {
		to.add(t);
	}

	Iterable<Integer> getItr() {
		return to;
	}
}

class Pair {
	int first,second;
	public Pair(int f,int s) {
		this.first = f;
		this.second = s;
	}
}