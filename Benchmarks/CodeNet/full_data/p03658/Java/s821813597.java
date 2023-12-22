import java.util.*;

public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] l = new Integer[n];
        
        for(int i = 0; i< n; i++) l[i] = sc.nextInt();
        
        Arrays.sort(l, Comparator.reverseOrder());
        
        int res = 0;
        
        for(int i = 0; i < k; i++) res+=l[i];
        
        System.out.println(res);
    }
}

class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {
 
    public Pair(final K key, final V value) {
        super(key, value);
    }
}
 

