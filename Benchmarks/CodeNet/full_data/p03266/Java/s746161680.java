import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int num = 0;
        int numB = 0;
        int numA = 0;
        int ans = 0;
        if (k % 2 == 1) {
            num = n / k;
            if (num == 0)
                System.out.println(0);
            else if (num == 1)
                System.out.println(1);
            else if (num == 2)
                System.out.println(8);
            else if (num == 3)
                System.out.println(27);
            else
                System.out.println(comb(num, 3) * 6 + comb(num, 2) * 6 + comb(num, 1));
        } else {
            numA = n / k;
            numB = (n + k / 2) / k;
            if (numA == 0)
                ans += 0;
            else if (numA == 1)
                ans += 1;
            else if (numA == 2)
                ans += 8;
            else if (numA == 3)
                ans += 27;
            else
                ans += comb(numA, 3) * 6 + comb(numA, 2) * 6 + comb(numA, 1);
            if (numB == 0)
                ans += 0;
            else if (numB == 1)
                ans += 1;
            else if (numB == 2)
                ans += 8;
            else if (numB == 3)
                ans += 27;
            else
                ans += comb(numB, 3) * 6 + comb(numB, 2) * 6 + comb(numB, 1);
            System.out.println(ans);
        }
    }

    static int comb(int n, int k) {
        int re = n;
        for (int i = 1; i < k; i++) {
            re = re * (n - i) / i;
        }
        return re / k;
    }
}
