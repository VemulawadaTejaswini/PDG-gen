import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            char[]ss = sc.next().toCharArray();
            Arrays.sort(ss);
            s[i] = new String(ss);
        }
        Map<String,Integer> map = new HashMap<>();
        long ans = 0;
        for(int i = 0; i < n; i++) {
            String key = s[i];
            if(map.containsKey(key)) {
                ans += map.get(key);
                map.put(key, map.get(key) + 1);
            }else {
                map.put(key, 1);
            }
        }
        System.out.println(ans);
    }
}
