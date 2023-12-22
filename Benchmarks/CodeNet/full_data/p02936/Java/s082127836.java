import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());
//		int[] a = new int[N-1];
//		int[] b = new int[N-1];
//		int[] p = new int[Q];
//		int[] x = new int[Q];
		int a,b,p,x;
		int idx;

		// 親-子リストのマップ
		HashMap<Integer, ArrayList<Integer>> pMap = new HashMap<Integer, ArrayList<Integer>>();
		// 値のマップ
		int[] value = new int[N+1];
		int[] counter = new int[N+1];

		ArrayList<Integer> childs;
		for (idx = 0; idx < N-1; idx++) {
			a = Integer.parseInt(sc.next());
			b = Integer.parseInt(sc.next());

			childs = pMap.get(a);
			if (childs == null) {
				childs = new ArrayList<Integer>();
				pMap.put(a, childs);
			}
			childs.add(b);
		}
		for (idx = 0; idx < Q; idx++) {
			p = Integer.parseInt(sc.next());
			x = Integer.parseInt(sc.next());
			counter[p] += x;
		}
		sc.close();

		// 処理するノード、親の1をスタート
//		LinkedList<Integer> nodes = new LinkedList<Integer>();
//		nodes.add(1);
		int[] nodes = new int[N];
		nodes[0] = 1;

		int node;
		int pos = 0;
		int tailpos = 1;

		while(true) {
			node = nodes[pos++];
			// 自身のカウンター足す
			value[node] += counter[node];
			// 子を取得
			childs = pMap.get(node);
			if (childs != null) {
				// 子に親の合計を足す
				for (int ch : childs) {
					value[ch] += value[node];
					nodes[tailpos++] = ch;
				}
			}

			if (pos >= N) {
				break;
			}
		}

		for (idx = 1; idx < N+1; idx++) {
			System.out.print(value[idx] + " ");
		}

	}

}
