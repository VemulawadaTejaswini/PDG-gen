import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, Long> map = new HashMap<>();
        map.put("M",0L);
        map.put("A",0L);
        map.put("R",0L);
        map.put("C",0L);
        map.put("H",0L);

        for (int i = 0; i < n; i++){
            String s = String.valueOf(sc.next().charAt(0));
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            }
        }
        System.out.println(map);
        long sum = 0;

        sum += map.get("M")*map.get("A")*map.get("R");
        sum += map.get("M")*map.get("A")*map.get("C");
        sum += map.get("M")*map.get("A")*map.get("H");
        sum += map.get("M")*map.get("R")*map.get("C");
        sum += map.get("M")*map.get("R")*map.get("H");
        sum += map.get("M")*map.get("C")*map.get("H");
        sum += map.get("A")*map.get("R")*map.get("C");
        sum += map.get("A")*map.get("R")*map.get("H");
        sum += map.get("A")*map.get("C")*map.get("H");
        sum += map.get("R")*map.get("C")*map.get("H");

        System.out.println(sum);
    }
}