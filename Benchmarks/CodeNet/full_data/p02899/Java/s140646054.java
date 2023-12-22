import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] a = new int[n];
        
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        
        List<Pair<Integer,Integer>> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            list.add(new Pair<>(a[i], i));
        }
        
        list.sort((x,y) -> x.getKey() - y.getKey());
        
        for(int i = 0; i < n; i++){
            System.out.print((list.get(i).getValue() + 1) + " ");
        }
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
