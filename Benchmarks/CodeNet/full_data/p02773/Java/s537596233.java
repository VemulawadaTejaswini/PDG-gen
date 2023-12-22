import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    Main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(N);
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            // list.add(sc.next());
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry);
        }
        Collections.sort(list, Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed());
        int k = list.get(0).getValue();
        List<String> ans = new ArrayList<String>(N);
        for (Map.Entry<String, Integer> entry : list) {
            if(k!=entry.getValue())break;
            ans.add(entry.getKey());
            // System.out.println(entry.getKey());
        }
        Collections.sort(ans,Comparator.naturalOrder());
        for(String str : ans){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
