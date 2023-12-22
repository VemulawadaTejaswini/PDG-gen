import java.util.*;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char[] c = sc.next().toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(map.containsKey(key)){
                map.put(key, map.get(key) + 1);
            }else{
                map.put(key, 1);
            }
        }
        long ans = 0;
        for(Entry<String, Integer> e : map.entrySet()){
            ans += (long)e.getValue() * (long)(e.getValue() -1) /2;
        }
        System.out.println(ans);
        sc.close();

    }

}
