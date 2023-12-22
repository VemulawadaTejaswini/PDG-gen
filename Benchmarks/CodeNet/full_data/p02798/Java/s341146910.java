import java.util.*;
public class Main {
	
	public static class p{
		int x, y;
		p(int x, int y){
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		Arrays.setAll(A, i -> sc.nextInt());
		int[] B = new int[N];
		Arrays.setAll(B, i -> sc.nextInt());
		int[] X = new int[N];
		boolean[] x = new boolean[N];
		int ok = 0;
		int ans = Integer.MAX_VALUE;
		LOOP:for(int i = 0; i < 1<<N; i++) {
			int c = 0;
		    for(int j = 0; j < N; j++) {
		        if ((1 & i >> j) == 1)
		            x[j] = true;
		        else {
		            x[j] = false;
		            c++;
		        }
		    }
		    if(c % 2 != 0)
		    	continue;
		    int[] q = new int[N];
		    List<p> even = new ArrayList<>();
		    List<p> odd = new ArrayList<>();
		    for(int j = 0; j < N; j++) {
		    	if(x[j]) {
		    		if(j % 2 == 0)
		    			even.add(new p(A[j], j));
		    		else
		    			odd.add(new p(A[j], j));
		    	}
		    	else {
		    		if(j % 2 == 0)
		    			odd.add(new p(B[j], j));
		    		else
		    			even.add(new p(B[j], j));
		    	}
		    }
		    if(odd.size() != even.size())
		    	continue;
		    Collections.sort(even, (a, b) -> a.x-b.y);
		    Collections.sort(odd, (a, b) -> a.x-b.y);
		    for(int j = 0; j < N; j++) {
		    	if(j % 2 == 0) {
		    		X[j] = even.get(j/2).x;
		    		q[j] = even.get(j/2).y;
		    	}
		    	else {
		    		X[j] = odd.get(j/2).x;
		    		q[j] = odd.get(j/2).y;
		    	}
		    }
		    if(X[1] < X[0])
		    	continue;
		    for(int j = 1; j < N; j++) {
		    	if(X[j] < X[j-1])
		    		continue LOOP;
		    }
		    ok += 1;
		    int n = 0;
		    W:while(true) {
		    	if(q[0] > q[1]) {
		    		n++;
		    		int t = q[0];
		    		q[0] = q[1];
		    		q[1] = t;
		    		continue;
		    	}
		    	for(int j = 1; j < N; j++) {
		    		if(q[j] < q[j-1]) {
		    			n++;
			    		int t = q[0];
			    		q[0] = q[1];
			    		q[1] = t;
			    		continue W;
		    		}
		    	}
		    	break;
		    }
		    ans = Math.min(ans, n);
		}
		if(ok == 0) {
			System.out.println(-1);
			return;
		}
		System.out.println(ans);

	}

}