import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> m1 = new HashMap<>();
        HashMap<Integer, Integer> m2 = new HashMap<>();
        int ma1 = 0;
        int maa1 = 0;
        int ma2 = 0;
        int maa2 = 0;
        int mi1 = 0;
        int mii1 = 0;
        int mi2 = 0;
        int mii2 = 0;

        for (int i = 0; i < n; i += 2) {
            if (m1.containsKey(v[i])) {
                m1.put(v[i], m1.get(v[i]) + 1);
            } else {
                m1.put(v[i], 1);
            }

            if (m2.containsKey(v[i + 1])) {
                m2.put(v[i + 1], m2.get(v[i + 1]) + 1);
            } else {
                m2.put(v[i + 1], 1);
            }

            int tmp1 = m1.get(v[i]);
            int tmp2 = m2.get(v[i + 1]);

            if (tmp1 > ma1 || (tmp1 == ma1 && mi1 != v[i])) {
                if (mi1 != v[i])
                    maa1 = ma1;
                ma1 = tmp1;
                if (mi1 != v[i])
                    mii1 = mi1;
                mi1 = v[i];
            }
            if (tmp2 > ma2 || (tmp2 == ma2 && mi2 != v[i + 1])) {
                if (mi2 != v[i + 1])
                    maa2 = ma2;
                ma2 = tmp2;
                if (mi2 != v[i + 1])
                    mii2 = mi2;
                mi2 = v[i + 1];
            }
        }

        int ans = 0;
        if (mi1 == mi2) {
            if (maa1 + ma2 > ma1 + maa2) {
                ans = n - maa1 - ma2;
            } else {
                ans = n - ma1 - maa2;
            }
        } else {
            ans = n - ma1 - ma2;
        }
        System.out.println(ans);

    }

}
