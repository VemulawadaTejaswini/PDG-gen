import java.util.*;

public class Main {

	static int N, M, K;
	
	void run() {

		//
		// 画面入力
		//
		Scanner sc = new Scanner(System.in);
    	N = sc.nextInt();
    	M = sc.nextInt();
    	K = sc.nextInt();

    	//
    	// グラフ作成 i=0は使用しないのでN+1作成する
    	// Adjacency list representation 
    	// 0.05(s) 可読性悪
    	//
    	List<List<Integer>> graph_friends = new ArrayList<List<Integer>>();
    	List<List<Integer>> graph_block = new ArrayList<List<Integer>>();
    	for (int i=0; i<N+1; i++) {
    		graph_friends.add(new ArrayList<Integer>());
    		graph_block.add(new ArrayList<Integer>());
    	}
    	
    	
    	UnionFind fr = new UnionFind(N+1);
    	// 友達入力、UniongetRootの計算
    	for (int i=0; i<M; i++) {
        	int a=sc.nextInt();
        	int b=sc.nextInt();
        	graph_friends.get(a).add(b);
        	graph_friends.get(b).add(a);
        	fr.unite(a, b); // getRootTree作成
    	}
    	//System.out.println(graph_friends);

    	// ブロック入力
    	for (int i=0; i<K; i++) {
        	int a=sc.nextInt();
        	int b=sc.nextInt();
        	// ルートが同じものだけ数える
        	if(fr.sameRoot(a, b)){
            	graph_block.get(a).add(b);
            	graph_block.get(b).add(a);
        	}
    	}
    	//System.out.println(graph_block);

    	//
    	// getRoot Tree
    	//
    	for(int i=1; i<N+1; i++){

    		/* これが遅い
    		List<Integer> known_list =  new ArrayList<Integer>();
    		for(int j=0; j<N+1; j++){
    			if(fr.sameRoot(i, j)){
    				known_list.add(j);
    			}
    		}
     		
        	// known_listから友達とブロックを引く
        	known_list.removeAll(graph_friends.get(i));
        	known_list.removeAll(graph_block.get(i));
    		*/

           	System.out.print(fr.size(fr.getRoot(i)) - graph_friends.get(i).size() - graph_block.get(i).size() - 1 + (i!=N ? " ":""));
    	}
   	
    	sc.close();
	}

	public class UnionFind {
        int[] parents, sizes;
 
        UnionFind(int n) {
            parents = new int[n];
            sizes = new int[n];
            for(int i = 0; i < n; i++) {
                parents[i] = i;
                sizes[i] = 1;
            }
        }
 
        public int getRoot(int x) {
            if (x == parents[x]){
            	return x;
            }
            return parents[x] = getRoot(parents[x]);
        }
 
        public void unite(int x, int y) {
            x = getRoot(x);
            y = getRoot(y);
            // 同じツリーなので統合不要
            if (x == y) return;
            // 違うツリーを統合。サイズの小さい方を大きい方に統合する。
            if (size(x) < size(y)) {
                int temp = x;
                x = y;
                y = temp;
            }
        	sizes[getRoot(y)] += sizes[x];
            parents[x] = y;
        }
 
        public boolean sameRoot(int x, int y) {
            return getRoot(x) == getRoot(y);
        }
 
        public int size(int x) {
            return sizes[getRoot(x)];
        }
        
     }
	
    public static void main(String[] args) {
        new Main().run();
    }
}