import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Map<String, Long> map = new HashMap<>();
        for (int i = 0; i < n; i ++){
            String str = scan.next();
            if (map.containsKey(str))
                map.put(str, map.get(str) + 1);
            else
                map.put(str, 1L);
        }
        long max = 0;
        List<Map.Entry<String, Long>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<String, Long>>() {
            @Override
            public int compare(Map.Entry<String, Long> s1, Map.Entry<String, Long> s2) {
                if (s1.getValue().equals(s2.getValue()))
                    return s1.getKey().compareTo(s2.getKey());
                return s2.getValue().compareTo(s1.getValue());
            }
        });
        max = list.get(0).getValue();
        for (Map.Entry<String, Long> stringIntegerEntry : list) {
            if (stringIntegerEntry.getValue() == max)
                System.out.println(stringIntegerEntry.getKey());
            else
                return;
        }
    }
}
