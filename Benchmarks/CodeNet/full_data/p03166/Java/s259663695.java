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

		N[] nodes = new N[n];
		for ( int i = 0; i < n; i++ ) {
			nodes[i] = new N();
		}

		for ( int i = 0; i < m; i++ ) {
			inputs = br.readLine().split(" ");
			int x = Integer.parseInt(inputs[0]) - 1, y = Integer.parseInt(inputs[1]) - 1;
			nodes[x].chldList.add(nodes[y]);
			nodes[y].prntCnt++;
		}

		ArrayDeque<N> toCheck = new ArrayDeque<>();
		for ( N node : nodes ) {
			if ( node.prntCnt == 0 ) toCheck.add(node);
		}

		int lenMax = 0;
		while ( toCheck.size() > 0 ) {
			N node = toCheck.pollFirst();
			for ( N chld : node.chldList ) {
				chld.prntCnt--;
				chld.len = Math.max(node.len + 1, chld.len);
				lenMax = Math.max(lenMax, chld.len);
				if ( chld.prntCnt == 0 ) {
					toCheck.add(chld);
				}
			}
		}
		System.out.println(lenMax);
	}
}

class N {

	int				len			= 0;
	int				prntCnt		= 0;
	ArrayList<N>	chldList	= new ArrayList<>();

	public N() {
	}
}
