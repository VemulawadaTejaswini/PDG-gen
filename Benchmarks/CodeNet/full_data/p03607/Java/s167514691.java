import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> as = new HashMap<>();
        
        int a;
        for (int i = 0; i < n; i++) {
            a = Integer.parseInt(br.readLine());
            if (as.get(a) == null) {
                as.put(a, 1);
            }
            else {
                as.put(a, as.get(a)+1);
            }
        }
        
        int count = 0;
        for (int x : as.values()) {
            if (x % 2 == 1) count++;
        }
        
        System.out.println(count);
    }
}
