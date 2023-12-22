import java.util.*;

public class Main {
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Map<Integer, Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());//降順ソート
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            if (treeMap.containsKey(key)) {
                treeMap.put(key,treeMap.get(key) + 1);
            } else {
                treeMap.put(key,1);
            }
        }
        int h = 0;
        int w = 0;
        for (Integer i : treeMap.keySet()) {
            if (treeMap.get(i) >= 4) {
                h = i;
                w = i;
                break;
            } else if (treeMap.get(i) >= 2) {
                if (h == 0) {
                    h = i;
                } else {
                    w = i;
                    break;
                }
            }
        }
        System.out.println(h*w);
    }
}
