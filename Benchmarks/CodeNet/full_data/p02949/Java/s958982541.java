import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	
	static final int INF_COIN = 100001;
	static final long INF_DIST = 5000000000000L;
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String[] firstArr = sc.nextLine().split(" ");
		int n = Integer.parseInt(firstArr[0]);
		int m = Integer.parseInt(firstArr[1]);
		int p = Integer.parseInt(firstArr[2]);
		
		int[][] edgeArr = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n;j++) {
				edgeArr[i][j] = INF_COIN;
			}
		}
		for(int i = 0; i < m; i++) {
			String[] edgeStrArr = sc.nextLine().split(" ");
			int a = Integer.parseInt(edgeStrArr[0]);
			int b = Integer.parseInt(edgeStrArr[1]);
			int coin = (-1)* (Integer.parseInt(edgeStrArr[2]) - p);
			edgeArr[a-1][b-1] = coin;
		}
		
		sc.close();
		
		// 1から到達できない点を見つける
		int[] arriveArr = new int[n];
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		queue.push(new Integer(0));
		arriveArr[0] = 1;
		while(!queue.isEmpty()) {
			int nodeNo = queue.pop();
			int[] nowEdgeArr = edgeArr[nodeNo];
			for(int i = 0; i < n; i++) {
				if(nowEdgeArr[i] < INF_COIN) {
					if(arriveArr[i] == 0) {
						queue.push(new Integer(i));
						arriveArr[i] = 1;
					}
				}
			}
		}
		// ゴールにたどり着けない点を見つける
		int[] reachableArr = new int[n];
		queue = new ArrayDeque<>();
		queue.push(new Integer(n - 1));
		reachableArr[n - 1] = 1;
		while(!queue.isEmpty()) {
			int endNodeNo = queue.pop();
			for(int i = 0; i < n; i++) {
				if(edgeArr[i][endNodeNo] < INF_COIN) {
					if(reachableArr[i] == 0) {
						queue.push(new Integer(i));
						reachableArr[i] = 1;
					}
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(reachableArr[i] == 0 || arriveArr[i] == 0) {
				for(int j = 0; j < n; j++) {
					edgeArr[i][j] = INF_COIN;
					edgeArr[j][i] = INF_COIN;
				}
			}
		}
		
		long[] distArr = new long[n];
		for(int i = 0; i < n; i++) {
			distArr[i] = INF_DIST;
		}
		distArr[0] = 0;
		// フロイドワーシャル
		for(int i  = 0; i < n; i++) {
			for(int j = 0; j < n;j++) {
				int edge = edgeArr[i][j];
				if(edge < INF_COIN) {
					if(distArr[i] != INF_DIST && distArr[j] > distArr[i] + edge){
						if(i == n - 1) {
							System.out.println(-1);
							return;
						}
						distArr[j] = distArr[i] + edge;
					}
				}
			}
		}
		
		long maxCoin = distArr[n - 1] * (-1);
		if(maxCoin < 0) {
			System.out.println(0);
		}else {
			System.out.println(maxCoin);
		}
	}
}
