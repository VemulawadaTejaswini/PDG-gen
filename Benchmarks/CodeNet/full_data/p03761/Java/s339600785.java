import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Map<Character, Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            Map<Character, Integer> map = new TreeMap<>();
            for (int j = 0; j < s.length(); j++) {
                map.merge(s.charAt(j), 1, Integer::sum);
            }
            list.add(map);
        }
        Map<Character, Integer> map2 = list.get(0);
        StringBuilder sb = new StringBuilder();
        if (list.size() == 0) {
            for (Map.Entry<Character, Integer> s : map2.entrySet()) {
                int num = s.getValue();
                for (int i = 0; i < num; i++) {
                    sb.append(s.getKey());
                }
            }
            sb.append("\n");
        } else {
            for (Map.Entry<Character, Integer> s : map2.entrySet()) {
                int num = s.getValue();
                boolean hasC = true;
                for (int i = 1; i < list.size(); i++) {
                    Map<Character, Integer> tempMap = list.get(i);
                    if (tempMap.containsKey(s.getKey())) {
                        num = Math.min(tempMap.get(s.getKey()), num);
                    } else {
                        hasC = false;
                        break;
                    }
                }
                if (hasC) {
                    for (int i = 0; i < num; i++) {
                        sb.append(s.getKey());
                    }
                }
            }
        }
        System.out.println(sb.toString());
    }
}