import java.util.*;

public class Main {

	static int N, M, K;
	
	//
	// Depth First Search により友達の友達を洗い出す
	//
	public static void dfs(List<List<Integer>> graph, List<Integer> known_list, int s){
   	
    	// 自分に到達可能
    	known_list.add(s);

    	for(int next_s: graph.get(s)){
    		if(known_list.contains(next_s)){
    			// 探索済み
    			continue;
    		}else{
    			dfs(graph, known_list, next_s);
    		}
    	}
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
    	// Adjacency list representation 
    	// 0.05(s) 可読性悪
    	//
    	List<List<Integer>> graph_friends = new ArrayList<List<Integer>>();
    	List<List<Integer>> graph_block = new ArrayList<List<Integer>>();
    	List<List<Integer>> graph_seen = new ArrayList<List<Integer>>();
    	for (int i=0; i<N+1; i++) {
    		graph_friends.add(new ArrayList<Integer>());
    		graph_block.add(new ArrayList<Integer>());
    		graph_seen.add(new ArrayList<Integer>());
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
    		
    		List<Integer> known_list =  new ArrayList<Integer>();
        	dfs(graph_friends, known_list, i);
        	

        	// seenから友達とブロックを引く
        	known_list.removeAll(graph_friends.get(i));
        	known_list.removeAll(graph_block.get(i));
        	if(i != 0){
            	System.out.print(known_list.size() - 1);
            	if(i != N){
            		System.out.print(" ");
            	}
        	}
    	}
   	
    	sc.close();
	}

}