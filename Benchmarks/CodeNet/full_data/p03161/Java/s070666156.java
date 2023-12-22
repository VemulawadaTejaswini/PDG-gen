import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int N = sc.nextInt();
    		final int K = sc.nextInt();
    		int[] h = new int[N];
    		for (int i=0; i<N; i++) {
    			h[i] = sc.nextInt();
    		}
    		int[] costs = new int[N];


    		costs[0] = 0;
    		for (int i=1; i<N; i++) {
    			int minCost = Integer.MAX_VALUE;
    			for (int j=1; j<=K; j++) {
    				if (i-j >= 0) {
        				int tmpCost = costs[i-j] + Math.abs(h[i] - h[i-j]);
        				if (tmpCost < minCost) {
        					minCost = tmpCost;
        				}
    				}
    			}
    			costs[i] = minCost;
    		}
    		System.out.println(costs[N-1]);

    	} finally {
    		sc.close();
    	}
    }
}

