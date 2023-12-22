import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    static HashMap<Integer, ArrayList<Integer>> e = new HashMap<Integer, ArrayList<Integer>>();
    static HashMap<Integer, Boolean> calculated = new HashMap<Integer, Boolean>();
    static HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
    static int[] depth = new int[1 + 1000*(1000 - 1)/2];
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		int[][] v = new int[n][n];
		int id = 0;
		int currentId = 0;
		int prevId = 0;

        for(int k = 0; k < n; k++){
            for(int l = 0; l < n - 1; l++){
                int i = k;
                int j = sc.nextInt() - 1;
                if(i > j){
                    int tmp = j;
                    j = i;
                    i = tmp;
                }
                if(v[i][j] == 0){
                    id++;
                    v[i][j] = id;
                    //System.out.println((i+1) + "vs" + (j+1) + ":" + id);
                }
                currentId = v[i][j];
                if(prevId == 0){
                    prevId = v[i][j];
                }else{
                    if(e.get(currentId) == null){
                        ArrayList<Integer> list = new ArrayList<Integer>();
                        list.add(prevId);
                        e.put(currentId, list);
                    }else{
                        ArrayList<Integer> list = e.get(currentId);
                        list.add(prevId);
                        e.put(currentId, list);
                    }
                    prevId = currentId;
                }
            }
            prevId = 0;
            currentId = 0;
        }
        
		// 計算
		/*
		System.out.println(id);
		for(int i = 1; i <= id; i++){
		    if(e.get(i) == null){
	            System.out.println(i + ":");
		    }else{
    		    System.out.println(i + ":" + e.get(i).toString());		        
		    }
		}
		*/
		int result = 0;
		for(int i = 1; i <= id; i++){
		    int res = dfs(i);
		    if(res == -1){
		        result = -1;
		        break;
		    }
		    result = max(result, res);
		}

		// 出力
		System.out.println(result);
	}
	
	static int dfs(int id){
	    if(visited.get(id) != null && visited.get(id)){
    	    if(calculated.get(id) != null && calculated.get(id)) return depth[id];
    	    return -1;
	    }
	    visited.put(id, true);
	    depth[id] = 1;
	    if(e.get(id) == null){
    	    calculated.put(id, true);
	        return depth[id];
	    }
	    for(Integer i : e.get(id)){
	        int res = dfs(i);
	        if(res == -1) return -1;
	        depth[id] = max(depth[id], res + 1);
	    }
	    calculated.put(id, true);
	    return depth[id];
	}
	
}
