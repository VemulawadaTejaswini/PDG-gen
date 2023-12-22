import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long h = sc.nextLong();
        List<Long> hpList = calcHpRem(h);
        long[] power2 = new long[64];
        for(int i = 0; i < 64; ++i) {
            power2[i] = (i == 0) ? 1 : power2[i - 1] * 2;
        }

        long ans = 0;
        for(int i = 0, f = hpList.size(); i < f; ++i) {
            ans += power2[i];
        }
        System.out.println(ans);
    }

    static List<Long> calcHpRem(long h) {
        List<Long> hpList = new ArrayList<>(65);
        while(h > 0) {
            hpList.add(h);
            h /= 2;
        }
        return hpList;
    }
}