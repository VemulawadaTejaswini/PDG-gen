import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        
        Map<String, Integer> map = new HashMap<>();
        for (String s : str) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s)+1);
            } else {
                map.put(s, 1);
            }
        }
        
        System.out.println(map.containsKey("1") ? map.get("1") : 0);
    }
}
