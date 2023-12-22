import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int h = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        long use[] = new long[4];
        use[0] = q;
        use[1] = Math.min(q * 2, h);
        use[2] = Math.min(use[1] * 2, s);
        use[3] = Math.min(use[2] * 2, d);
        long ans = 0;
        if (n >= 2) {
            long count = n / 2;
            ans += count * use[3];
            n -= 2 * count;
        }
        if (n >= 1) {
            ans += use[2];
        }
        System.out.println(ans);
        sc.close();
    }
}
