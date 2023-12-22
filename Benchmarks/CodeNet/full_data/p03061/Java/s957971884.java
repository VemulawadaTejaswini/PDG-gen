import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] an = new int[n];
        for (int i = 0; i < n; i++) {
            an[i] = sc.nextInt();
        }
        sc.close();

        int gcd;
        int max = 0;
        for (int i = 0; i < an.length; i++) {
            if (i == 0) {
                gcd = an[1];
            } else {
                gcd = an[0];
            }
            for (int j = 1; j < an.length; j++) {
                if (i == j || (i == 0 && j == 1)) {
                    continue;
                }
                if (gcd > an[j]) {
                    gcd = gcd(gcd, an[j]);
                } else {
                    gcd = gcd(an[j], gcd);
                }
                if (gcd < max) {
                    break;
                }
            }
            max = gcd < max ? max : gcd;
        }
        System.out.println(max);
    }

    private static int gcd(int large, int small) {
        int tmp = large;
        while ((large % small != 0)) {
            large = small;
            small = tmp % small;
        }
        return small;
    }
}
