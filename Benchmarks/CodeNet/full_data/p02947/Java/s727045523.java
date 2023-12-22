import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.next();
        }
        Map<String, Integer> map = new HashMap<>();
        long result = 0;
        for (int i = 0; i < s.length; i++) {
            char[] c = s[i].toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            if (map.keySet().contains(str)) {
                result += map.get(str);
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
            
        }
        System.out.println(result);
        sc.close();
    }
}