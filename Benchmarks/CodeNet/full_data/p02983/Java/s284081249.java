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
        if (l <= 2019 && r >= 2019) return 0;
        int res = 2018;
        for (int i = l; i < r; i++) {
            for (int j = i + 1; j <= r; j++) {
                res = Math.min(res, i * j % 2019);
                if (res == 0) return res;
            }
        }
        return res;
    }
}
