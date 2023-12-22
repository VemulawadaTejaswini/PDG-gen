import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long k = in.nextLong();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        SortedMap<Integer, Integer> m = new TreeMap<>();
        long invPerA = 0;
        for(int i=0; i<n; i++) {
            invPerA += countGreater(m, a[i]);
            int c = m.containsKey(a[i]) ? m.get(a[i]) : 0;
            m.put(a[i], c+1);
        }
        long invForPrevA = 0;
        for(int i=0; i<n; i++) {
            invForPrevA += countGreater(m, a[i]);
        }
        long c = invPerA * k + invForPrevA * (k * (k-1) / 2);
        c = c % 1000000007;
        System.out.println(c);
    }
    private static int countGreater(SortedMap<Integer, Integer> m, int key) {
        SortedMap<Integer, Integer> sub = m.tailMap(key);
        Set<Integer> keySet = sub.keySet();
        Iterator<Integer> it = keySet.iterator();
        int c = 0;
        while(it.hasNext()) {
            int k = it.next();
            if(k == key) {
                continue;
            }
            c += sub.get(k);
        }
        return c;
    }
}
