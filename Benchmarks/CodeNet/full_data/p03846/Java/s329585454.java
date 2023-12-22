import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i=0; i<n; i++){
            s[i] = sc.next();
        }
        long count = 0;
        
        Map<String, Integer> m = new HashMap<>();

        for (String a : s) {
            int v;
            if (m.containsKey(a)) {
                // Mapに登録済み
                v = m.get(a) + 1;
            } else {
                // Mapに未登録
                v = 1;
            }
            m.put(a, v);
        }
        
        for (String key : m.keySet()) {
           count += m.get(key);
        }
        count *= 2;
        count = count % (1000000000+7);

        if (n % 2 != 0 && count+1 != n){
            count = 0;
        }

        System.out.println(count);
        
        
    }

}
