import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s[] = new int[100_000 + 1];
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (a - 1 >= 0) s[a - 1]++;
            s[a]++;
            if (a + 1 <= 100_000) s[a + 1]++;
        }

        int mx = 0;
        for (int i = 0; i < 100_000; i++) {
            mx = Math.max(mx, s[i]);
        }

        System.out.println(mx);
    }
}