import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int h[] = new int[N];
		for(int i=0;i<N;i++) {
			h[i]=sc.nextInt();
		}
		int cost[] = new int[N];
		cost[N-1] = 0;
		cost[N-1-1] = Math.abs(h[N-1] - h[N-1-1]);
		
		for(int i=N-2-1;i>=0;i--) {
			cost[i] = Math.min(cost[i+1]+Math.abs(h[i+1]-h[i]), cost[i+2]+Math.abs(h[i+2]-h[i]));
		}
		
		System.out.println(cost[0]);
	}

}
