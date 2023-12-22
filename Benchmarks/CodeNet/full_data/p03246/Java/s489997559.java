import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        int num = Integer.parseInt(in.nextLine());
        for (int i = 0; i < num; i++) {
            String str = in.next();
            if (i % 2 == 0) {
                if (map1.containsKey(str)) {
                    map1.put(str, map1.get(str) + 1);
                } else {
                    map1.put(str, 1);
                }
            } else {
                if (map2.containsKey(str)) {
                    map2.put(str, map2.get(str) + 1);
                } else {
                    map2.put(str, 1);
                }
            }
        }
        in.close();
        List<Integer> map1k = new ArrayList<>();
        List<Integer> map1v = new ArrayList<>();
        List<Integer> map2k = new ArrayList<>();
        List<Integer> map2v = new ArrayList<>();
        map1.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(2)
                .forEach( e -> {
                        map1k.add(Integer.parseInt(e.getKey()));
                        map1v.add(e.getValue());
                });
        map2.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(2)
                .forEach( e -> {
                map2k.add(Integer.parseInt(e.getKey()));
                map2v.add(e.getValue());
        });
        map1v.add(Integer.valueOf(0));
        map2v.add(Integer.valueOf(0));
        int ans = num;
        if (map1k.get(0) == map2k.get(0)) {
            if (map1v.get(0) - map1v.get(1) < map2v.get(0) - map2v.get(1)) {
                ans -= (map2v.get(0) + map1v.get(1));
            } else {
                ans -= (map2v.get(1) + map1v.get(0));
            }
        } else {
            ans -= (map1v.get(0) + map2v.get(0));
        }
        System.out.println(ans);
    }
}
