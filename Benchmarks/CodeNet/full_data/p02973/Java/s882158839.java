import java.io.PrintWriter;
import java.util.*;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    final long mod = 1000000000 + 7;

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solve());
    }

    long solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, Integer> tree = new TreeMap<>();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            Integer key = tree.lowerKey(a);
            if(key!=null) deleteFrom(tree,key);
            addTo(tree, a);
        }
        long ans = 0;
        for(Map.Entry<Integer,Integer> e: tree.entrySet()){
            ans += e.getValue();
        }
        return ans;
    }
    void addTo(TreeMap<Integer,Integer> map, int x){
        Integer val = map.get(x);
        if(val==null){
            map.put(x,1);
        } else{
            map.put(x,val+1);
        }
    }
    void deleteFrom(TreeMap<Integer, Integer> map, int x){
        Integer val = map.get(x);
        if(val==null) return;
        if(val==1) map.remove(x);
        else map.put(x,val-1);
    }
}
