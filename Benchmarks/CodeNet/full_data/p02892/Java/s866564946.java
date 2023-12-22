import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[] houmon;
	static ArrayList<Integer>[] rinList;
	static int kaisou;
	static boolean sFlag = true;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		rinList = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			rinList[i] = new ArrayList<Integer>();
		}

		int[] rinN = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			String s = sc.next();
			for (int j = i + 1; j <= N; j++) {
				if(s.charAt(j - 1) == '1') {
					rinList[i].add(j);
					rinList[j].add(i);
					rinN[i]++;
					rinN[j]++;
				}
			}
		}

		sc.close();

		int min = 201;
		int minIndex = 1;
		for(int i = 1;i <= N;i++) {
			if(rinN[i] < min) {
				min = rinN[i];
				minIndex = i;
			}
		}

		int resMin;

		kaisou = 1;
		Queue<Integer> firstNode = new ArrayDeque<Integer>();
		firstNode.add(minIndex);
		houmon = new int[N + 1];
		houmon[minIndex] = 1;

		myBFS(firstNode);

		if(sFlag) {
//			System.out.println(kaisou);
			resMin = kaisou;
		}else {
			System.out.println(-1);
			return;
		}


		for(int f : rinList[minIndex]) {
			kaisou = 1;
			firstNode = new ArrayDeque<Integer>();
			firstNode.add(minIndex);
			houmon = new int[N + 1];
			houmon[minIndex] = 1;

			myBFS(firstNode);

			if(kaisou < resMin) resMin = kaisou;
		}

		System.out.println(resMin);


	}

	private static void myBFS(Queue<Integer> nodeQ) {
//		System.out.println("func" + kaisou);
		if(!sFlag) return;
		Queue<Integer> nextNodeQ = new ArrayDeque<Integer>();
		while(!nodeQ.isEmpty()) {
			int node = nodeQ.poll();
//			System.out.println("node:" + node);
			if(rinList[node] == null) break;
			for(int nextNode : rinList[node]) {
//				System.out.print("	nextnode:" + nextNode);
				if(houmon[nextNode] != 0) {
//					System.out.println("×");
					if(kaisou % 2 + 1 != houmon[nextNode]) {
						sFlag = false;
						return;
					}
					continue;
				}
//				System.out.println("○");
				houmon[nextNode] = kaisou % 2 + 1;
				nextNodeQ.add(nextNode);
			}
		}
		if(!nextNodeQ.isEmpty()) {
			kaisou++;
			myBFS(nextNodeQ);
		}
	}
}
