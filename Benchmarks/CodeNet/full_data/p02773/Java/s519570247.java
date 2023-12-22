import java.util.*;
import java.util.Map.*;   // Entryを使うときは、paizaではこれを宣言する

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        int max = 0;
        while (n-- > 0) {
            String w = sc.next();
            if (!map.containsKey(w)) {
                map.put(w, 1);
                max = Math.max(max, 1);
            } else {
                int v = map.get(w);
                map.put(w, v + 1);
                max = Math.max(max, v + 1);
            }
        }
        
        List<String> list = new ArrayList<String>();
        for (Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int val = entry.getValue();
            if (val == max) {
                list.add(key);
            }
        }
        list.sort(Comparator.naturalOrder());
        
        for (String s : list) {
            System.out.println(s);
            
        }
    }
}
