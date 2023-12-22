import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int minCost = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int cost = sc.nextInt();
			int time = sc.nextInt();
			if (time <= t) {
				if (cost < minCost) {
					minCost = cost;
				}
			}
		}
		if (minCost == Integer.MAX_VALUE) {
			System.out.println("TLE");
		} else {
			System.out.println(minCost);
		}
	}
}