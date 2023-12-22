import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.next());
        Map<String, Integer> counts = new HashMap<>();
        int maxCount = 0;
        for(int i = 0; i < n; ++i) {
            String k = sc.next();
            int t = counts.getOrDefault(k, 0);
            counts.put(k, t + 1);
            maxCount = Math.max(maxCount, t + 1);
        }
        
        List<String> sl = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : counts.entrySet()) {
            if(entry.getValue() == maxCount) {
                sl.add(entry.getKey());
            }
        }
        
        Collections.sort(sl);
        for(String s : sl) {
            System.out.println(s);
        }
    }
}
