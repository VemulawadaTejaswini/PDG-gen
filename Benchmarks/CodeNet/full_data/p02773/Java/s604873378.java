import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static int N;
    private static Map<String, Integer> count = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        int maxCount = 0;
        for(int i=0; i<N; i++) {
            String s = sc.next();
            if(count.containsKey(s)) {
                int c = count.get(s) + 1;
                count.put(s, c);
                maxCount = Math.max(maxCount, c);
            }else {
                count.put(s, 1);
                maxCount = Math.max(maxCount, 1);
            }
        }
        
        List<String> result = new ArrayList<>();
        
        for(String key : count.keySet()) {
            if(count.get(key) == maxCount) {
                result.add(key);
            }
        }
        
        Collections.sort(result);
        
        result.forEach(System.out::println);
    }
}
