import java.util.*;
import java.util.Map.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        int g1 = h * w % 2;
        int g2 = h % 2 * w / 2 + w % 2 * h / 2;
        int g4 = (h * w - g2 * 2 - g1) / 4;
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                String c = String.valueOf(str.charAt(j));
                if (map.containsKey(c)) {
                    int value = map.get(c);
                    map.put(c, value + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
        
        boolean pass = true;
        
        while (g4 > 0) {
            boolean ng = true;
            for (Entry<String, Integer> entry : map.entrySet()) {
                int v = entry.getValue();
                if (v == 0) continue;
                if (v % 4 == 0) {
                    g4--;
                    map.put(entry.getKey(), entry.getValue() - 4);
                    
                    if (g4 == 0) break;
                    ng = false;
                }
                
            }
            
            if (g4 == 0) break;
            if (ng) {
                System.out.println("No");
                return;
            }
        }
        
        while (g2 > 0) {
            boolean ng = true;
            for (Entry<String, Integer> entry : map.entrySet()) {
                int v = entry.getValue();
                if (v == 0) continue;
                if (v % 4 == 2) {
                    g2--;
                    map.put(entry.getKey(), entry.getValue() - 2);
                    
                    if (g2 == 0) break;
                    ng = false;
                }
            }
            
            if (g2 == 0) break;
            if (ng) {
                System.out.println("No");
                return;
            }
        }
        
        while (g1 > 0) {
            boolean ng = true;
            for (Entry<String, Integer> entry : map.entrySet()) {
                int v = entry.getValue();
                if (v == 0) continue;
                if (v % 4 == 1 || v % 4 == 3) {
                    g1--;
                    map.put(entry.getKey(), entry.getValue() - 1);
                    
                    if (g1 == 0) break;
                    ng = false;
                }
            }
            
            if (g1 == 0) break;
            if (ng) {
                System.out.println("No");
                return;
            }
        }
        
        for (Entry<String, Integer> entry : map.entrySet()) {
            int v = entry.getValue();
            if (v != 0) {
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
    }
}
