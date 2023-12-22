import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }else {
                map.put(key, 1);
            }
        }
        int ans = 0;
        int max = Collections.max(map.keySet());
        List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                return obj1.getValue().compareTo(obj2.getValue());
            }
        });
        for (int i = 0; i < list.size(); i++) {
            if(list.size() - i <= k) {
                System.out.println(ans);
                break;
            } else {
                ans += list.get(i).getValue();
                //list.get(list.size() - 1).setValue(list.get(list.size() - 1).getValue() + list.get(0).getValue());
                //list.remove(0);
            }
        }

    }
}