import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        
        Set<Long> divA = new HashSet<Long>();
        Set<Long> divB = new HashSet<Long>();
        for (int i = 1; i*i < Math.max(A,B); i++) {
            if (A%i == 0) {
                divA.add((long)i);
                divA.add(A/i);
            }
            if (B%i == 0) {
                divB.add((long)i);
                divB.add(B/i);
            }
        }

        List<Long> divCommon = new ArrayList<Long>();
        for (Long l : divA) {
            if (divB.contains(l)) {
                divCommon.add(l);
            }
        }

        long ans = 0;
        Collections.sort(divCommon);
        for (Long i : divCommon) {
            if (i == 1) {
                ans++;
                continue;
            }
            boolean div = false;
            for (Long j : divCommon) {
                if (i <= j) {
                    break;
                }
                if (i%j == 0 && j != 1) {
                    div = true;
                    break;
                }
            }
            if (!div) {
                ans++;
            }
        }

        //System.out.println(divCommon);
        System.out.println(ans);
    }
}
