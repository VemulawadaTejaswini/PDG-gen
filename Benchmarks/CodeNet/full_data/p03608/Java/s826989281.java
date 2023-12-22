
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Main m = new Main();
	m.answer();
    }

    private Scanner scan = new Scanner(System.in);
    private final int N;
    private final int M;
    private final int R;
    private final List<Integer> rList;
    private final int[][] dist;
    private final static int INF = 1000_000_000;

    public Main() {
	N = Integer.parseInt(scan.next());
	M = Integer.parseInt(scan.next());
	R = Integer.parseInt(scan.next());

	rList= new ArrayList<Integer>(R);
	for (int i = 0; i < R; i++) {
	    rList.add(Integer.parseInt(scan.next()) - 1);
	}

	dist = new int[N][N];
	for (int i = 0; i < N; i++) {
	    for (int j = 0; j < N; j++) {
		if(i == j) dist[i][j] = 0;
		else dist[i][j] = INF;
	    }
	}

	for (int i = 0; i < M; i++) {
	    int A = Integer.parseInt(scan.next()) - 1;
	    int B = Integer.parseInt(scan.next()) - 1;
	    int C = Integer.parseInt(scan.next());

	    dist[A][B] = dist[B][A] = C;
	}
	
	scan.close();
    }

    public final void answer() {

	for (int k = 0; k < N; k++) {
	    for (int i = 0; i < N; i++) {
		for (int j = 0; j < N; j++) {
		    dist[i][j] = Integer.min(dist[i][j], dist[i][k] + dist[k][j]);
		}
	    }
	}

	int min = INF;
	List<List<Integer>> list = permutate(rList);

	for(List<Integer> item: list) {
	    int tmp = 0;
	    for (int i = 1; i < item.size(); i++) {
		tmp += dist[item.get(i-1)][item.get(i)];
	    }
	    if(tmp < min) min = tmp;
	}

	System.out.println(min);
    }

    private List<List<Integer>> permutate(List<Integer> list) {

	List<List<Integer>> result = new ArrayList<List<Integer>>();

	if(list.size() == 1) {
	    result.add(list);
	    return result;
	}

	for(Integer i: list) {
	    List<Integer> newList = new ArrayList<Integer>(list);
	    newList.remove(i);

	    List<List<Integer>> eachResult = permutate(newList);
	    for(List<Integer> item: eachResult) {
		item.add(0, i);
	    }

	    result.addAll(eachResult);
	}

	return result;
    }
}
