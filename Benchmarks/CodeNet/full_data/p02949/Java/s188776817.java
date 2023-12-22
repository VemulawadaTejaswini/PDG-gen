import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static final int INF_COIN = 100000001;
	static final long INF_DIST = 5000000000000000000L;
	
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
		ArrayDeque<Integer> queueArrive = new ArrayDeque<>();
		queueArrive.push(new Integer(0));
		arriveArr[0] = 1;
		while(!queueArrive.isEmpty()) {
			int nodeNo = queueArrive.pop();
			int[] nowEdgeArr = edgeArr[nodeNo];
			for(int i = 0; i < n; i++) {
				if(nowEdgeArr[i] < INF_COIN) {
					if(arriveArr[i] == 0) {
						queueArrive.push(new Integer(i));
						arriveArr[i] = 1;
					}
				}
			}
		}
		// ゴールにたどり着けない点を見つける
		int[] reachableArr = new int[n];
		ArrayDeque<Integer> queueReachable = new ArrayDeque<>();
		queueReachable.push(new Integer(n - 1));
		reachableArr[n - 1] = 1;
		while(!queueReachable.isEmpty()) {
			int endNodeNo = queueReachable.pop();
			for(int i = 0; i < n; i++) {
				if(edgeArr[i][endNodeNo] < INF_COIN) {
					if(reachableArr[i] == 0) {
						queueReachable.push(new Integer(i));
						reachableArr[i] = 1;
					}
				}
			}
		}
		
//		for(int i = 0; i < n; i++) {
//			System.out.println(Arrays.toString(edgeArr[i]));
//		}
		
		
		ArrayList<ArrayList<Integer>> edgeMtr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			ArrayList<Integer> edgeList = new ArrayList<>();
			edgeMtr.add(edgeList);
			if(arriveArr[i] == 0 || reachableArr[i] == 0) {
				continue;
			}
			for(int j = 0; j < n; j++) {
				if(edgeArr[i][j] >= INF_COIN || arriveArr[j] == 0 || reachableArr[j] == 0) {
					continue;
				}
				edgeList.add(j);
			}
		}
		
//		for(ArrayList<Integer> edgeList : edgeMtr) {
//			System.out.println(edgeList);
//		}
		
		long[] distArr = new long[n];
		for(int i = 0; i < n; i++) {
			distArr[i] = INF_DIST;
		}
		distArr[0] = 0;
		for(int i  = 0; i < n; i++) {
			for(int k = 0 ; k < n;k++) {
				ArrayList<Integer> edgeList = edgeMtr.get(k);
				for(int j = 0; j < edgeList.size();j++) {
					int endNode = edgeList.get(j);
					int edge = edgeArr[k][endNode];
					if(distArr[k] != INF_DIST && distArr[endNode] > distArr[k] + (long)edge){
						if(i == n - 1) {
							System.out.println(-1);
							return;
						}
						distArr[endNode] = distArr[k] + (long)edge;
					}
				}	
			}
		}
		
//		System.out.println(Arrays.toString(distArr));
		
		long maxCoin = distArr[n - 1] * (-1L);
		if(maxCoin < 0) {
			System.out.println(0);
		}else {
			System.out.println(maxCoin);
		}
	}
}
