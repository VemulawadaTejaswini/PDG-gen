import java.util.*;

public class Main {
    static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer>[] aMaps = new HashMap[n];
        HashMap<Integer, Integer> all = new HashMap<>();
        for (int i = 0; i < n; i++) {
            aMaps[i] = getBase(sc.nextInt());
            for (Map.Entry<Integer, Integer> entry : aMaps[i].entrySet()) {
                if (all.containsKey(entry.getKey())) {
                    if (all.get(entry.getKey()) < entry.getValue()) {
                        all.put(entry.getKey(), entry.getValue());
                    }
                } else {
                    all.put(entry.getKey(), entry.getValue());
                }
            }
        }
        long total = 0;
        for (int i = 0; i < n; i++) {
             for (Map.Entry<Integer, Integer> entry : all.entrySet()) {
                if (aMaps[i].containsKey(entry.getKey())) {
                    aMaps[i].put(entry.getKey(), entry.getValue() - aMaps[i].get(entry.getKey()));
                } else {
                    aMaps[i].put(entry.getKey(), entry.getValue());
                }
            }
            total += getValue(aMaps[i]);
            total %= MOD;
       }
        System.out.println(total);
    }
    
    static long getValue(HashMap<Integer, Integer> map) {
        long ans = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                continue;
            }
            long tmp = 1;
            for (int i = 0; i < entry.getValue(); i++) {
                tmp *= entry.getKey();
                tmp %= MOD;
            }
            ans *= tmp;
            ans %= MOD;
        }
        return ans;
    }
    
    static HashMap<Integer, Integer> getBase(int x) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        for (int i = 2; i <= Math.sqrt(x); i++) {
            while (x % i == 0) {
                if (ans.containsKey(i)) {
                    ans.put(i, ans.get(i) + 1);
                } else {
                    ans.put(i, 1);
                }
                x /= i;
            }
        }
        if (x != 1) {
            if (ans.containsKey(x)) {
                ans.put(x, ans.get(x) + 1);
            } else {
                ans.put(x, 1);
            }
        }
        return ans;
    }
}