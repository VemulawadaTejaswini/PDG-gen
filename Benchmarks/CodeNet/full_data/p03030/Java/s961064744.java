// 参考 -> #5833462
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s;
        int p;
        Map<String, TreeMap<Integer, Integer>> tmp = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            s = sc.next();
            p = sc.nextInt();
            if (tmp.containsKey(s)) {
                tmp.get(s).put(p, i+1);
            } else {
                TreeMap<Integer, Integer> hoge = new TreeMap<>();
                hoge.put(p, i+1);
                tmp.put(s, hoge);
            }
        }

        for (String key : tmp.keySet()) {
            TreeMap<Integer, Integer> tmp1 = new TreeMap<>();
            tmp1 = tmp.get(key);
            List<Integer> tmp2 = new LinkedList<>();

            for (int i : tmp1.keySet()) {
                int value = tmp1.get(i);
                tmp2.add(0, value);
            }

            for (int i : tmp2) {
                System.out.println(i);
            }
        }
    }
}