import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        Integer[] a = new Integer[n];
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        
        Arrays.sort(a);
        
        List<Pair<Integer,Integer>> list = new ArrayList<Pair<Integer,Integer>>();
        
        for(int i = 0; i < m; i++){
            list.add(new Pair<>(sc.nextInt(), sc.nextInt()));
        }
        
        list.sort((x,y) -> y.getValue() - x.getValue());
        
        //一回変えたやつを変えるのは無駄
        
        int next = 0; //次ぎかえるもの
        
        for(Pair<Integer, Integer> pair : list){
            int b = pair.getKey(); //個数
            int c = pair.getValue(); //値

            for(int i = next; i < n; i++){
                if(b == 0){
                    next = i;
                    break;
                }
                
                if(a[i] < c){
                    a[i] = c;
                    b--;
                }else{
                    next = i;
                    break;
                }
            }
        }

        System.out.println(Arrays.stream(a).mapToLong(x -> (long)x).sum());
        
    }
}

class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {
 
    public Pair(K key, V value) {
        super(key, value);
    }
 
    public Pair<V, K> swap() {
    	return new Pair<V, K>(getValue(), getKey());
    }
 }


class UnionFind {
	int[] par;
	
	public UnionFind(int n) {
		par = new int[n];
		
		Arrays.fill(par,-1);
	}
	
	int root(int x) {
		if(par[x] < 0) return x;
		return par[x] = root(par[x]);
	}
	
	void unite(int x,int y) {
	    x = root(x);
	    y = root(y);
	    
	    if(x != y){
	        if(par[x] > par[y]){
	            int tmp = x;
	            x = y;
	            y = tmp;
	        }
	        par[x] += par[y];
	        par[y] = x;
	    }
	}
	
	boolean same(int x,int y) {
		int rx = root(x);
		int ry = root(y);
		return rx == ry;
	}
	
	int size(int x){
		return -par[root(x)];
	}
}