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
        Map<Integer, Integer> cmap = new HashMap<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            cmap.put(e.getKey(), e.getValue() * (e.getValue()-1) /2);
        }

        int allsum = 0;
        for (Integer c : cmap.values()) {
            allsum+=c;
        }
        Map<Integer, Integer> sumMap = new HashMap<>();
        for (Map.Entry<Integer, Integer> e : cmap.entrySet()) {
            sumMap.put(e.getKey(), allsum - e.getValue());
        }

        for (int i = 0;i<n;i++) {
            int count = map.get(a[i]) - 1;
            if (count > 0) {
                int ans = count * (count - 1 )/2 + sumMap.get(a[i]);
                System.out.println(ans);
            } else {
                System.out.println(sumMap.get(a[i]));
            }
        }
    }
}
