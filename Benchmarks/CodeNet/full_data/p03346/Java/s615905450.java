import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int p[] = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        int ans = 0;
        for (int tmp = 0;; tmp++) {
            int head = p[0];
            int tmpp[] = Arrays.stream(p).filter(num -> num > head).toArray();
            if (p.length - tmpp.length != 1) {
                ans += (p.length - tmpp.length - 1) + tmp;
            }
            p = Arrays.copyOf(tmpp, tmpp.length);

            if (check(p)) {
                break;
            }

            int foot = p[p.length - 1];
            tmpp = Arrays.stream(p).filter(num -> foot > num).toArray();
            if (p.length - tmpp.length != 1) {
                ans += (p.length - tmpp.length - 1) + tmp;
            }
            p = Arrays.copyOf(tmpp, tmpp.length);

            if (check(p)) {
                break;
            }
        }

        System.out.println(ans);
    }

    private boolean check(int p[]) {
        if (p.length == 0) {
            return true;
        }

        for (int i = 0; i < p.length - 1; i++) {
            if (p[i] > p[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
