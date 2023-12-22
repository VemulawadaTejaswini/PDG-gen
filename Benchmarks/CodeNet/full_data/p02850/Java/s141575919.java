import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		int N = Integer.parseInt(W)+1;
		int leafs[] = new int[N];
		int roots[] = new int[N];
		int color[] = new int[N];
		Arrays.fill(leafs, 1);
		Arrays.fill(roots, 0);
		Arrays.fill(color, 0);
		int maxLeaf = 2;
		for(int i=1;i<N-1;i++){
			W = in.readLine();
			String[] Ws = W.split(" ");
			int root = Integer.parseInt(Ws[0]);
			int leaf = Integer.parseInt(Ws[1]);
			leafs[root] = leafs[root]+1;
			if(maxLeaf < leafs[root]){
				maxLeaf = leafs[root];
			}
			//添え時のノードのルートはvalue
			roots[leaf] = root;
		}


		color[1] = 0;
		for(int i=1;i<N;i++){
			int col = (color[i]+1)%maxLeaf;
			for(int k=2;k<N;k++){
				if(roots[k]==i){
					color[k]=col;
					col = (col+1)%maxLeaf;
				}
			}
		}

		for(int i=1;i<N;i++){
			System.out.println(color[i]);
		}


	}


}
