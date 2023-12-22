
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	int[] x = new int[N];
	int[] y = new int[N];
	boolean[] notlinked = new boolean[N];
	
	for (int i = 0; i < N; i++) {
	    notlinked[i] = true;
	    x[i] = Integer.parseInt(scan.next());
	    y[i] = Integer.parseInt(scan.next());
	}

	List<Edge> list = new ArrayList<Edge>();
	for (int i = 0; i < N; i++) {
	    for (int j = i+1; j < N; j++) {
		list.add(new Edge(i, j, min(Math.abs(x[i]-x[j]), Math.abs(y[i]-y[j]))));
	    }
	}
	Collections.sort(list);

	notlinked[0] = false;
	int total = 0;
	for (int i = 0; i < N-1; i++) {
	    for(Iterator<Edge> itr = list.iterator(); itr.hasNext();) {
		Edge e = itr.next();
		int idx1 = e.from;
		int idx2 = e.to;

		if(!notlinked[idx1] && !notlinked[idx2]) {
		    itr.remove();
		} else if(!notlinked[idx1] && notlinked[idx2]) {
		    total += e.cost;
		    notlinked[idx2] = false;
		    itr.remove();
		    break;
		} else if(!notlinked[idx2] && notlinked[idx1]) {
		    total += e.cost;
		    notlinked[idx1] = false;
		    itr.remove();
		    break;
		}
	    }
	}
	
	System.out.println(total);
	scan.close();
    }

    private static int min(int x, int y) {
	return x < y ? x : y;
    }
}

class Edge implements Comparable<Edge>{
    int from;
    int to;
    int cost;

    Edge(int from, int to, int cost) {
	this.from = from;
	this.to = to;
	this.cost = cost;
	}

    @Override
    public int compareTo(Edge o) {
	return cost - o.cost;
    }
    
}
