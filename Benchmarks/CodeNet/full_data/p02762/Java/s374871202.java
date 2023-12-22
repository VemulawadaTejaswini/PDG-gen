import java.util.*;

public class Main {

	static int N, M, K;
	
	//
	// Depth First Search により友達の友達を洗い出す
	//
	public static List<Boolean> dfs(List<List<Integer>> graph, List<Boolean> seen, int s){
   	
    	// 自分に到達可能
    	seen.set(s, true);
    	
    	for(int next_s: graph.get(s)){
    		if(seen.get(next_s)){
    			// 探索済み
    			continue;
    		}else{
    			dfs(graph, seen, next_s);
    		}
    	}
    	
    	return seen;
	}
	
	public static void main(String[] args) {

		//
		// 画面入力
		//
		Scanner sc = new Scanner(System.in);
    	N = sc.nextInt();
    	M = sc.nextInt();
    	K = sc.nextInt();

    	//
    	// グラフ作成 i=0は使用しないのでN+1作成する
    	//
    	List<List<Integer>> graph_friends = new ArrayList<List<Integer>>();
    	List<List<Integer>> graph_block = new ArrayList<List<Integer>>();
    	List<List<Integer>> graph_seen = new ArrayList<List<Integer>>();

    	for (int i=0; i<N+1; i++) {
    		List<Integer> list_friends = new ArrayList<Integer>();
    		graph_friends.add(list_friends);
    		List<Integer> list_block = new ArrayList<Integer>();
    		graph_block.add(list_block);
    		List<Integer> list_seen = new ArrayList<Integer>();
    		graph_seen.add(list_seen);
    	}

    	// 友達入力
    	for (int i=0; i<M; i++) {
        	int a=sc.nextInt();
        	int b=sc.nextInt();
        	graph_friends.get(a).add(b);
        	graph_friends.get(b).add(a);
    	}

    	//System.out.println(graph_friends);

    	// ブロック入力
    	for (int i=0; i<K; i++) {
        	int a=sc.nextInt();
        	int b=sc.nextInt();
        	graph_block.get(a).add(b);
        	graph_block.get(b).add(a);
    	}
    	
    	//System.out.println(graph_block);

    	//
    	// 深さ優先探索 。まずはstart:1、end:3
    	//

    	for(int i=0; i<N+1; i++){
        	List<Boolean> seen = new ArrayList<Boolean>();
        	for (int j=0; j<N+1; j++) {
        		seen.add(false);
        	}
        	dfs(graph_friends, seen, i);
        	
        	List<Integer> result_list =  new ArrayList<Integer>();
        	for(int k=0; k<N+1; k++){
        		// seenの内容を入れる
        		if(seen.get(k)){
            		result_list.add(k);
        		}
        	}
        	// seenから友達をブロックを引く
        	result_list.removeAll(graph_friends.get(i));
        	result_list.removeAll(graph_block.get(i));
        	if(i != 0){
            	System.out.print(result_list.size() - 1);
            	if(i != N){
            		System.out.print(" ");
            	}
        	}
    	}
    	
    	sc.close();
	}

}