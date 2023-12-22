import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        try {
            // 標準入力
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String str[] = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            str = br.readLine().split(" ");
            Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                int tmp = Integer.parseInt(str[i]);
                if (map.containsKey(tmp)) {
                    int val = map.get(tmp) + 1;
                    map.put(tmp, val);
                } else {
                    map.put(tmp, 1);
                }
            }
            List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(map.entrySet());

            Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
                public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                    return obj1.getValue().compareTo(obj2.getValue());
                }
            });

            if (map.size() > k) {
                int ans = 0;
                int count = map.size() - k;
                int i = 0;
                    for (Entry<Integer, Integer> entry : list_entries) {
                        int val = entry.getValue();
                        ans += val;
                        i++;
                        if (count <= i) {
                            break;
                        }
                    }
                System.out.println(ans);
            } else {
                System.out.println(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
