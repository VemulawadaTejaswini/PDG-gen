import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    int M = Integer.parseInt(scanner.next());
	    int[] P = new int[M];
	    long[] Y = new long[M];
	    List<Long>[] map = new List[M];

	    for (int i = 0; i < M; i++) {
	    	P[i] = Integer.parseInt(scanner.next());
	    	Y[i] = Long.parseLong(scanner.next());
	    	if (map[P[i]] != null) {
	    		map[P[i]].add(Y[i]);
	    	} else {
	    		List<Long> l = new ArrayList<Long>();
	    		l.add(Y[i]);
	    		map[P[i]] = l;
	    	}
	    }

	    for(int i=0; i<M; i++){
	    	if (map[i] != null)
	    	Collections.sort(map[i]);
	    }

	    for (int i = 0; i < M; i++) {
	    	int ind = map[P[i]].indexOf(Y[i]) + 1;
	    	System.out.println(String.format("%06d", P[i]) + String.format("%06d", ind));
	    }
	}

}