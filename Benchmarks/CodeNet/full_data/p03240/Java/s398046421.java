import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    int[] x = new int[N];
	    int[] y = new int[N];
	    long[] h = new long[N];

	    int[] xa = new int[10201];
	    int[] ya = new int[10201];
	    long[] ha = new long[10201];
	    boolean[] b = new boolean[10201];

	    for (int i=0; i<N; i++) {
	    	x[i]=Integer.parseInt(scanner.next());
	    	y[i]=Integer.parseInt(scanner.next());
	    	h[i] = Long.parseLong(scanner.next());
	    }

	    for (int i=0; i<10201; i++) {
	    	b[i]=true;
	    }

    	boolean f=false;
	    for (int i=0; i<N; i++) {
	    	if (h[i] == 0) {
	    		b[x[i] * 101 + y[i]] = false;
	    		continue;
	    	}
	    	for (int j=0; j<=100; j++) {
	    		for (int k=0; k<=100; k++) {
	    			if (ha[j* 101 + k] ==0) {
	    		        xa[j* 101 + k] = j;
			    	    ya[j* 101 + k] = k;
			    	    ha[j* 101 + k] = Math.abs(x[0] - j) + Math.abs(y[0] - k) + h[0];
	    			}

			    	if ((b[j* 101 + k] == true)) {
			    		if(Math.max(ha[j* 101 + k] - Math.abs(x[i] - j) - Math.abs(y[i] - k), 0) != h[i]) {
			    			b[j* 101 + k] = false;
			    		}
			    	}
			    }
		    }
	    }

	    for (int i =0; i<10201; i++) {
	    	if (b[i] == true) {
	    		System.out.print(xa[i]+ " " + ya[i] + " " + ha[i]);
	    		return;
	    	}
	    }
	}

}