import java.util.Scanner;

public class Main {
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), r = sc.nextInt();
        System.out.println(sln(l, r));
        sc.close();
    }

    static int sln(int l, int r) {
        if (r - l >= 2019) return 0;
        int res = 2019;
        for (int i = l; i < r; i++) {
            for (int j = i + 1; j <= r; j++) {
                int mod = ((j % 2019) * (i % 2019)) % 2019;
                res = Math.min(res, mod);
            }
        }
        return res;
    }
}
