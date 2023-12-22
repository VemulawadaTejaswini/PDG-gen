import java.util.*;

class Main
{
    static class Plate
    {
        Plate(long a, long b) { this.a = a; this.b = b; }
        final long a, b;
    }

    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        Plate[] p = new Plate[n];
        for (int i = 0; i < n; i++) {
            long a = cin.nextLong();
            long b = cin.nextLong();
            p[i] = new Plate(a, b);
        }
        Arrays.sort(p, (x, y) -> Long.compare(y.a + y.b, x.a + x.b));
        long sign = 1;
        long ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans += sign * p[i].a - (1 - sign) * p[i].b;
            sign = 1 - sign;
        }
        System.out.println(ans);
    }
}
