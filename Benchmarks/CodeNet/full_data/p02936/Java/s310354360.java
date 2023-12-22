import static java.lang.System.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		//ノードごとの子ノードを記録する配列
		List<Integer>[] nodeList = new ArrayList[200010];
		for(int i = 0; i < nodeList.length;i++) {
			nodeList[i] = new ArrayList<>();
		}
		for(int i = 0; i < n - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			nodeList[a].add(b);
		}
	    long[] score = new long[200010];
		for(int i = 0; i < q; i++) {
			int p = sc.nextInt();
			long x = sc.nextLong();
			score[p] += x;
		}	
		Queue<Integer> que = new ArrayDeque<>();
		que.offer(1);
		while(que.size() > 0) {
			int num = que.poll();
			for(int i = 0; i < nodeList[num].size(); i++) {
				int koNode = nodeList[num].get(i);
				score[koNode] += score[num];
				que.offer(koNode);
			}
		}
		for(int i = 1; i <= n; i++) {
			out.print(score[i] +  " ");
		}
		
		
	}
}
