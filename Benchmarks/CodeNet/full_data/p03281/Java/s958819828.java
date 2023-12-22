import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 105; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 8) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
