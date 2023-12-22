import java.math.BigInteger;
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
        BigInteger x1 = new BigInteger(Long.toString(invPerA));
        BigInteger x2 = new BigInteger(Long.toString(invForPrevA));
        BigInteger k2 = new BigInteger(Long.toString(k));
        BigInteger k3 = new BigInteger(Long.toString(k-1));
        BigInteger two = new BigInteger("2");
        BigInteger c = x1.multiply(k2).add(x2.multiply(k2).multiply(k3).divide(two));
        //long c = invPerA * k + invForPrevA * (k * (k-1) / 2);
        BigInteger mod = new BigInteger("1000000007");
        c = c.mod(mod);
        System.out.println(c.toString());
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
