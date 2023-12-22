import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            List<String> list = new ArrayList<>();
            for (Character c : str.toCharArray()) {
                list.add(c.toString());
            }
            Collections.sort(list);
            StringJoiner sj = new StringJoiner("");
            for (String s : list) {
                sj.add(s);
            }
            String key = sj.toString();

            if (map.containsKey(key)) {
                map.put(key, map.get(key)  + 1);
            } else {
                map.put(key, 1);
            }

        }
        sc.close();

        long count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value >= 2) {
                count += combi(value);
            }
        }
        System.out.print(count);
    }

    private static long combi(long n) {
        if (n <= 1) return 0;
        return n * (n - 1) / 2;
    }
}