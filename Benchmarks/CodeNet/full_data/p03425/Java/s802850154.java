import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); in.nextLine();
        Map<Character, Long> map = new HashMap<Character, Long>(){{
            put('M', 0L); put('A', 0L); put('R', 0L); put('C', 0L); put('H', 0L);
        }};
        for (int i = 0; i < n; i++) {
            char ch = in.nextLine().charAt(0);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }
        }
        long ans = 0;
        ans += map.get('M') * map.get('A') * map.get('R');
        ans += map.get('M') * map.get('A') * map.get('C');
        ans += map.get('M') * map.get('A') * map.get('H');
        ans += map.get('M') * map.get('R') * map.get('C');
        ans += map.get('M') * map.get('R') * map.get('H');
        ans += map.get('M') * map.get('C') * map.get('H');
        ans += map.get('A') * map.get('R') * map.get('C');
        ans += map.get('A') * map.get('R') * map.get('H');
        ans += map.get('A') * map.get('C') * map.get('H');
        ans += map.get('R') * map.get('C') * map.get('H');
        System.out.println(ans);
    }
}
