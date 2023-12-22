import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            String tmp = sc.next();
            s[i] = convert(tmp);
        }
        sc.close();

        Map<String, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
            if (map.keySet().contains(s[i])) {
                ans += map.get(s[i]);
            } else {
                map.put(s[i], 0);
            }
            map.put(s[i], map.get(s[i]) + 1);
        }
        System.out.println(ans);

    }

    static String convert(String input) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i));
        }
        Collections.sort(list);
        String result = list.stream().map(e -> String.valueOf(e)).collect(Collectors.joining(""));
        return result;
    }
}
