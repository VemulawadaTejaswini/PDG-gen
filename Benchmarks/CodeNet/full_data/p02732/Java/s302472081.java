import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Integer[] list = new Integer[N];
        for (int i = 0; i < N; i++) {
            list[i] = scanner.nextInt();
        }
        int total = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (map.containsKey(list[i])) {
                map.replace(list[i], map.get(list[i]), map.get(list[i])+1);
            } else {
                map.put(list[i], 1);
            }
        }
        for (int key : map.keySet()) {
            int v = map.get(key);
            total += calc(v);
        }
        for (int i = 0; i < N; i++) {
            int v = map.get(list[i]);
            int v2 = calc(v) - calc(v-1);
            System.out.println(total - Math.max(v2, 0));
        }
    }
    private static int calc(int v) {
        return v * (v-1)/2;
    }
}
