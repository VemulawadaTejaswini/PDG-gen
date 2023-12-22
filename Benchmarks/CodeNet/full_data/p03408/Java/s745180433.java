import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        HashMap<String, Integer> cards = new HashMap<String, Integer>();
        
        for (int i = 0; i < n; i++) {
            String key = br.readLine();
            if (cards.get(key) == null) cards.put(key, 1);
            else cards.put(key, cards.get(key) + 1);
        }
        
        int m = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < m; i++) {
            String key = br.readLine();
            if (cards.get(key) == null) cards.put(key, -1);
            else cards.put(key, cards.get(key) - 1);
        }
        
        int max = 0;
        for (int value : cards.values()) {
            if (max < value) max = value;
        }
        
        System.out.println(max);
    }
}
