import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String[] s = str.split("");
        long div = (long) Math.pow(10, 9) + 7;
        Map<String, Long> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(s[i])) {
                map.put(s[i], map.get(s[i]) + 1);
                continue;
            }
            map.put(s[i], 1L);
        }

        long count = 0;
        for (int i = 0; i < Math.pow(2, map.size()); i++) {
            String string = "";
            for (int j = 0; j <= n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (((i >> j) & 1) == 1) {
                    String key = (String) map.keySet().toArray()[j];
                    string = string + key;
                }
            }
            if ("".equals(string)) {
                continue;
            }
            String[] stringArr = string.split("");
            long c = 1;
            for (int j = 0; j < string.length(); j++) {
                c *= map.get(stringArr[j]) % div;
            }
            count += c;
            //System.out.println(string + " " + c);
        }
        System.out.println(count);
    }
}
