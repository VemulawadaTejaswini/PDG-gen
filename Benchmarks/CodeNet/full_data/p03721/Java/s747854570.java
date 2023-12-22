import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int key = sc.nextInt();
            int value = sc.nextInt();
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + value);
            }else {
                map.put(key, value);
            }
        }
        List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                return obj1.getKey().compareTo(obj2.getKey());
            }
        });
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).getValue();
            if(sum >= k) {
                System.out.println(list.get(i).getKey());
                return;
            }
        }
    }
}