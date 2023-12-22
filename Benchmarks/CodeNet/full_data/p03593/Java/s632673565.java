import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        char a[][] = new char[h][w];
        for (int i = 0; i < h; i++) {
            sc.next().getChars(0, w, a[i], 0);
        }

        for (int i = 0; i < h; i++) {
            int cnt[] = new int[26];
            for (int j = 0; j < w; j++) {
                cnt[a[i][j] - 'a']++;
            }

            if (Arrays.stream(cnt).filter(n -> n % 2 == 1).count() > 1) {
                System.out.println("No");
                return;
            }
        }

        for (int j = 0; j < w; j++) {
            int cnt[] = new int[26];
            for (int i = 0; i < h; i++) {
                cnt[a[i][j] - 'a']++;
            }

            if (Arrays.stream(cnt).filter(n -> n % 2 == 1).count() > 1) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
