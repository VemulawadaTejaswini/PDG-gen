
import java.util.*;
	public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int n = Integer.parseInt(sc.next());
            int m = Integer.parseInt(sc.next());
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            int[] par = new int[n+1], rank = new int[n+1];
            int a, b, count = 0;
            
            for(int i=0; i<n; i++){
            	map.put(Integer.parseInt(sc.next()), i+1);
            }
            
            for(int i=0; i<n+1; i++){
            	par[i] = i;
            	rank[i] = 0;
            }
            
            for(int i=0; i<m; i++){
            	a = Integer.parseInt(sc.next());
            	b = Integer.parseInt(sc.next());
            	
            	unite(a, b, par, rank);
            }
            
            for (Integer key : map.keySet()) {
            	if(same(key, map.get(key), par)){
        			count++;
        		}
    		}

            System.out.println(count);
            sc.close();
        }
        
        // 各unionのリーダーを返す関数
        public static int getLeader(int a, int[] par){            
        	return par[a] == a ? a : (par[a] = getLeader(par[a], par));
        }
      
        public static boolean same(int a, int b, int[] par){
        	return getLeader(a, par) == getLeader(b, par);
        }
        
        public static void unite(int a, int b, int[] par, int[] rank){
        	a = getLeader(a, par);
        	b = getLeader(b, par);
        	
        	if(a == b){
        		return;
        	}
        	
        	if(rank[a] < rank[b]){
        		par[a] = b;
        	}else{
        		par[b] = a;
        		if(rank[a] == rank[b]){
        			rank[a]++;
        		}
        	}
        }
    }
	