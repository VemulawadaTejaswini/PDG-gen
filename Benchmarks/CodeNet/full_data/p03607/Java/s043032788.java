import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (!map.containsKey(num)) {
                map.put(num, true);
            } else {
                map.put(num, !map.get(num));
            }
        }
        int cnt = 0;
        for (boolean b : map.values()) {
            if (b) cnt++;
        }
        System.out.println(cnt);
    }
}
