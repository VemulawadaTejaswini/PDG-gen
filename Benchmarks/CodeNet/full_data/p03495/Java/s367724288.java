import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        
        List<Integer> a = new ArrayList<Integer>();
        
        for(int i = 0; i < n; i++){
            a.add(Integer.parseInt(sc.next()));
        }
        
        int res = 0;
        
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        
        for(int i : a){
            count.put(i, Collections.frequency(a, i));
        }
        List<Map.Entry<Integer, Integer>> list_entries = new ArrayList<Map.Entry<Integer, Integer>>(count.entrySet());
        
        Collections.sort(list_entries, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> obj1, Map.Entry<Integer, Integer> obj2)
            {
                return obj1.getValue().compareTo(obj2.getValue());
            }
        });
        
        for(Map.Entry<Integer,Integer> entry : list_entries){
            if(n - res <= k) break;
            
            res+=entry.getValue();
            
        }
        
        System.out.println(res);
    }
}
