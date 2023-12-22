import java.util.*;

public class Main {

    public static  void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> map = new HashMap<>();
        map.put("M",0);
        map.put("A",0);
        map.put("R",0);
        map.put("C",0);
        map.put("H",0);
        String[] march ={"M", "A", "R", "C", "H"};
        for(int i = 0; i < n; i++){
            String str = scanner.next();
            str = str.substring(0,1);
            int v;
            if(str.equals("M") || str.equals("A") || str.equals("R") || str.equals("C") || str.equals("H")) {
                if (map.containsKey(str)) {
                    v = map.get(str) + 1;
                } else {
                    v = 1;
                }
                map.put(str,v);
            }
        }
        long ans = map.get(march[0]) * map.get(march[1]) * map.get(march[2]);
        ans += map.get(march[0]) * map.get(march[1]) * map.get(march[3]);
        ans += map.get(march[0]) * map.get(march[1]) * map.get(march[4]);
        ans += map.get(march[0]) * map.get(march[2]) * map.get(march[3]);
        ans += map.get(march[0]) * map.get(march[2]) * map.get(march[4]);
        ans += map.get(march[0]) * map.get(march[3]) * map.get(march[4]);
        ans += map.get(march[1]) * map.get(march[2]) * map.get(march[3]);
        ans += map.get(march[1]) * map.get(march[2]) * map.get(march[4]);
        ans += map.get(march[1]) * map.get(march[3]) * map.get(march[4]);
        ans += map.get(march[2]) * map.get(march[3]) * map.get(march[4]);
        System.out.println(ans);
    }
}