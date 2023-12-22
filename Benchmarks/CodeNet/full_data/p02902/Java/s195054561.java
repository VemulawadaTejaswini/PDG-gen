

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] firstArr = sc.nextLine().split(" ");
		int n = Integer.parseInt(firstArr[0]);
		int m = Integer.parseInt(firstArr[1]);
		
		ArrayList<ArrayList<Integer>> vectorList = new ArrayList<>();
		for(int i = 0 ; i < n;i++) {
			vectorList.add(new ArrayList<Integer>());
		}
		
		for(int i = 0; i < m;i++) {
			String[] lineArr = sc.nextLine().split(" ");
			int a = Integer.parseInt(lineArr[0]);
			int b = Integer.parseInt(lineArr[1]);
			vectorList.get(a-1).add(b-1);
		}
		
		sc.close();
		
		ArrayList<Integer> bestCycle = null;
		for(int i = 0; i < n;i++) {
			ArrayList<Integer> cycle = bfs(i, vectorList, n);
			if(cycle == null) {
				continue;
			}
			if(bestCycle == null || cycle.size() < bestCycle.size()) {
				bestCycle = cycle;
			}
		}
		
		if(bestCycle == null) {
			System.out.println("-1");
		}else {
			System.out.println(bestCycle.size());
			for(int point : bestCycle) {
				System.out.println(point+1);
			}
		}
		
	}
	
	public static ArrayList<Integer> bfs(int start, ArrayList<ArrayList<Integer>> vectorList, int n){
		
		final int INF = 1001001001;
		int[] dist = new int[n];
		int[] pre = new int[n];
		for(int i = 0; i < n; i++) {
			dist[i] = INF;
			pre[i] = -1;
		}
		dist[start] = 0;
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		queue.push(new Integer(start));
		while(!queue.isEmpty()) {
			int point  = queue.pop();
			for(int nextPoint : vectorList.get(point)) {
				if(dist[nextPoint] != INF) {
					continue;
				}
				dist[nextPoint] = dist[point] + 1;
				queue.push(new Integer(nextPoint));
				pre[nextPoint] = point;
			}
		}
		
		int minDist = INF;
		int lastPointInMinPath = -1;
		for(int i = 0; i < n ;i++) {
			if(i == start) {
				continue;
			}
			for(int nextPoint : vectorList.get(i)) {
				if(nextPoint == start) {
					if(minDist > dist[i]) {
						minDist = dist[i];
						lastPointInMinPath = i;
					}
				}
			}
		}
		
		if(minDist == INF) {
			return null;
		}else {
			ArrayList<Integer> retList = new ArrayList<>();
			retList.add(0, new Integer(lastPointInMinPath));
			int v = pre[lastPointInMinPath];
			while(v != -1) {
				retList.add(0, new Integer(v));
				v = pre[v];
			}
			return retList;
		}
	}

}
