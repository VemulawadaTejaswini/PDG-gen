import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int[] h = new int[N+1];
	for(int i = 0; i<N; i++) {
	    h[i] = sc.nextInt();
	}
	int[] cost = new int[N];

	cost[0] = 0;
	cost[1] = Math.abs(h[1]-h[0]);

	for(int i = 2; i<N; i++) {
	    int c1 = cost[i-1] + (int)(Math.abs(h[i] - h[i-1]));
	    int c2 = cost[i-2] + (int)(Math.abs(h[i] - h[i-2]));
	    cost[i] = Math.min(c1,c2);
	}
	System.out.println(cost[N-1]);


    }
}