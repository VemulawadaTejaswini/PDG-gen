import java.util.Scanner;

public class Main {
    static long n;
    static int[] g;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        long gcm = 1;
        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            gcm = LCM(gcm, num);
        }
        System.out.println(gcm);
    }
    //最大公約数
    static long GCM (long x, long y) {
        long tmp = x % y;
        if (tmp == 0) return y;
        return GCM(y, tmp);

    }
    //最小公倍数
    static long LCM(long x, long y) {
        return x / GCM(x,y) * y;
    }
}
