import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int res = 0;
        for (int i = 1; i < n; i++) {
            String x = s.substring(0, i);
            String y = s.substring(i);

            HashMap<String, Integer> mapX = new HashMap<>();
            HashMap<String, Integer> mapY = new HashMap<>();

            for (int j = 0; j < x.length(); j++) {
                String key = new String(new char[]{x.charAt(j)});
                if (mapX.containsKey(key)) {
                    mapX.put(key, mapX.get(key) + 1);
                } else {
                    mapX.put(key, 1);
                }
            }

            for (int j = 0; j < y.length(); j++) {
                String key = new String(new char[]{y.charAt(j)});
                if (mapY.containsKey(key)) {
                    mapY.put(key, mapY.get(key) + 1);
                } else {
                    mapY.put(key, 1);
                }
            }

            int max = 0;// XとYでの同じ文字の数
            for (Map.Entry entry: mapX.entrySet()) {
                String key = (String) entry.getKey();

                if (mapY.containsKey(key)) {// XとYで同じ文字をカウントする
                    max++;
                }
            }

            res = Math.max(max, res);
        }

        System.out.println(res);
    }
}
