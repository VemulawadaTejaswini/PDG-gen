import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
            Integer c = map.getOrDefault(a[i], 0);
            map.put(a[i], ++c);
        }
        Map<Integer, Long> cmap = new HashMap<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            cmap.put(e.getKey(), (long) e.getValue() * (e.getValue()-1) /2);
        }

        long allsum = 0;
        for (Long c : cmap.values()) {
            allsum+=c;
        }
        Map<Integer, Long> sumMap = new HashMap<>();
        for (Map.Entry<Integer, Long> e : cmap.entrySet()) {
            sumMap.put(e.getKey(), allsum - e.getValue());
        }

        for (int i = 0;i<n;i++) {
            int count = map.get(a[i]) - 1;
            if (count > 0) {
                long ans = count * (count - 1 )/2 + sumMap.get(a[i]);
                System.out.println((int) ans);
            } else {
                long ans = sumMap.get(a[i]);
                System.out.println((int) ans);
            }
        }
    }
}
