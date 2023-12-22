
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	UnionFind u = new UnionFind(N);
	List<Integer> bNeighbor = new ArrayList<Integer>();
	List<Integer> wNeighbor = new ArrayList<Integer>();
	for (int i = 0; i < N-1; i++) {
	    int a = Integer.parseInt(scan.next()) - 1;
	    int b = Integer.parseInt(scan.next()) - 1;
	    if(a > b) {
		int tmp = a;
		a = b;
		b = tmp;
	    }
	    if(a == 0 && b != N-1) {
		bNeighbor.add(b);
	    } else if(b == N-1 && a != 0) {
		wNeighbor.add(a);
	    } else if(a != 0 && b != N-1) {
		u.connect(a, b);
	    }
	}

	List<Integer> black = new ArrayList<Integer>();
	List<Integer> white = new ArrayList<Integer>();
	List<Integer> both = new ArrayList<Integer>();
	for(int node: bNeighbor) black.add(u.root(node));
	for(int node: wNeighbor) {
	    int g = u.root(node);
	    if(black.contains(g)) {
		black.remove(Integer.valueOf(g));
		both.add(g);
	    } else {
		white.add(g);
	    }
	}

	int blackCount = 0;
	for(int g: black) blackCount += u.size(g);
	int whiteCount = 0;
	for(int g: white) whiteCount += u.size(g);
	int bothCount = 0;
	for(int g: both) bothCount += u.size(g);

	if(bothCount % 2 != 0) blackCount++;

	System.out.println(blackCount > whiteCount ? "Fennec" : "Snuke");
	scan.close();
    }

    private static class UnionFind {
	private int[] u;

	public UnionFind(int n) {
	    u = new int[n];
	    for (int i = 0; i < n; i++) {
		u[i] = -1;
	    }
	}

	public int size(int a) {
	    return -u[root(a)];
	}

	public int root(int a) {
	    if(u[a] < 0) return a;
	    return u[a] = root(u[a]);
	}

	public boolean connect(int a, int b) {
	    if(root(a) == root(b)) return false;

	    a = root(a);
	    b = root(b);
	    if(u[a] > u[b]) {
		int tmp = a;
		a = b;
		b = tmp;
	    }
	    u[a] += u[b];
	    u[b] = a;
	    return true;
	}
    }
}
