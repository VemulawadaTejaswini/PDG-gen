import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i=0;i<N;i++) {
            a[i] = Integer.parseInt(sc.next());
            if (map.containsKey(a[i])) map.put(a[i], map.get(a[i])+1);
            else map.put(a[i], 1);
        }

        long[] ans = new long[N];
        int index = 0;
        int sum = N;
        for (int i=0;i<N;i++) {
            while (map.size()>0 && map.firstKey()<a[i]) {
                sum -= map.get(map.firstKey());
                map.remove(map.firstKey());
            }
            if (a[i]>index) {
                ans[i] = (long)sum*(a[i]-index);
                index = a[i];
            }
        }

        for (int i=0;i<N;i++) System.out.println(ans[i]);
    }
}