import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int A = sc.nextInt();
        final int B = sc.nextInt();

        int ans = 0;
        for (int i = A; i <= B; i++) {
            int q = i / 10000 % 10;
            int w = i / 1000 % 10;
            int r = i / 10 % 10;
            int t = i % 10;
            if (q == t && w == r) ans++;
        }
        System.out.println(ans);
    }
}
