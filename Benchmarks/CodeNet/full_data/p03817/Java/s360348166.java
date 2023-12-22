import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long wa = 11;
        long ans = (x / wa) * 2; // 必要回数

        long rem = x % wa;
        if (rem > 6) {
            ans += 2;
        } else if (rem > 0) {
            ans += 1;

        }
        System.out.println(ans);

        sc.close();
    }
}
