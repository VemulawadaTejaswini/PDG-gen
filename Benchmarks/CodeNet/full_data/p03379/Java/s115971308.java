import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        int y[] = x.clone();
        Arrays.sort(y);
        int m1 = y[n / 2 - 1];
        int m2 = y[n / 2];
        if (m1 == m2) {
            for (int i = 0; i < n; i++) {
                System.out.println(m1);
            }
            return;
        }
        for (int i = 0; i < n; i++) {
            if (x[i] <= m1) {
                System.out.println(m2);
            } else {
                System.out.println(m1);
            }
        }
    }
}