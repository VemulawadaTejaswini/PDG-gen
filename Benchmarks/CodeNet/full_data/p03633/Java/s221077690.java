import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = 0;
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
            if (m < array[i]) {
                m = array[i];
            }
        }
        long ans = array[0];
        for (int i = 1; i < n; i++) {
            ans = getKobaisu(ans, array[i]);
        }
        if (ans < m) {
            ans = m;
        }
        System.out.println(ans);
    }
    
    private static long getKoyakusu(long a, long b) {
        long candidate = a;
        while (b % a != 0) {
            candidate = b % a;
             b = a;
             a = candidate;
        }
        return candidate;
    }
    
    private static long getKobaisu(long a, long b) {
        return (a * b) / getKoyakusu(a, b);
    }
}
