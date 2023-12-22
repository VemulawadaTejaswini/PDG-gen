import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int cnt[] = new int[26];
        for (int i = 0; i < h; i++) {
            String a = sc.next();
            for (int j = 0; j < w; j++) {
                cnt[a.charAt(j) - 'a']++;
            }
        }

        cnt = Arrays.stream(cnt).filter(n -> n != 0).toArray();

        System.out.println(check(h, w, cnt) ? "Yes" : "No");
    }

    private boolean check(int h, int w, int cnt[]) {
        if (Arrays.stream(cnt).filter(n -> n % 2 == 1).count() > 1) {
            return false;
        }

        long center = h % 2 * h + w % 2 * w - (h % 2 * w % 2);
        long cnt2 = Arrays.stream(cnt).filter(n -> n % 4 >= 2).count();
        if (center % 2 == cnt2 % 2) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
