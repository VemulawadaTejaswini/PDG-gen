import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs;
		inputs = br.readLine().split(" ");
		int n = Integer.parseInt(inputs[0]), m = Integer.parseInt(inputs[1]);

		// ノード配列作成
		Node[] nodes = new Node[n];
		for ( int i = 0; i < n; i++ ) {
			nodes[i] = new Node();
		}
		for ( int i = 0; i < m; i++ ) {
			inputs = br.readLine().split(" ");
			int x = Integer.parseInt(inputs[0]) - 1, y = Integer.parseInt(inputs[1]) - 1;
			nodes[x].chldList.add(nodes[y]);
			nodes[y].prntCnt++;
		}

		// 始点サーチ
		ArrayDeque<Node> toCheck = new ArrayDeque<>();
		for ( Node node : nodes ) {
			if ( node.prntCnt == 0 ) toCheck.add(node);
		}

		// BFSで距離計算開始
		int lenMax = 0;
		while ( toCheck.size() > 0 ) {
			Node node = toCheck.pollFirst();
			for ( Node chld : node.chldList ) {
				chld.prntCnt--;
				chld.len = Math.max(node.len + 1, chld.len);
				lenMax = Math.max(lenMax, chld.len);
				// 全返をチェックした子はチェックリストへ
				if ( chld.prntCnt == 0 ) {
					toCheck.add(chld);
				}
			}
		}
		System.out.println(lenMax);
	}
}

class Node implements Comparable<Node>{

	int				len			= 0;
	int				prntCnt		= 0;
	ArrayList<Node>	chldList	= new ArrayList<>();

	public Node() {
	}

	@Override
	public int compareTo(Node o) {
		
		return this.prntCnt - o.prntCnt;
	}
}
