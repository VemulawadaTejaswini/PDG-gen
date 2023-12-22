import java.util.*;

public class Main{
    
    public static final int MAX = (int)1e5+9;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] c = new int[MAX];
        HashMap<Integer, TreeSet<Integer>> h = new HashMap<>();
        for(int i=0; i<n; i++){
            c[i] = Integer.parseInt(sc.next());
            if(h.get(c[i]) != null){
                h.get(c[i]).add(i);
            }else{
                TreeSet<Integer> t = new TreeSet<>();
                t.add(MAX);
                h.put(c[i], t);
            }
        }
        
        long sum = 0;
        long[] d = new long[n];
        for(int i=0; i<n; i++){
            sum += d[i];
            TreeSet<Integer> t = h.get(c[i]);
            int tmp = t.higher(i);
            if(tmp < n && i+1!=tmp){
                d[tmp] += sum+1;
            }
        }
        
        System.out.println(sum+1);
    }
}
