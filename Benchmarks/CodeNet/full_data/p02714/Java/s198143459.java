import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }

    private void run() {
        int n = sc.nextInt();
        AtomicInteger ans = new AtomicInteger();
        char[] s = sc.next().toCharArray();

        List<Integer> r = new ArrayList<>();
        List<Integer> g = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            switch (s[i]) {
                case 'R':
                    r.add(i);
                    break;
                case 'G':
                    g.add(i);
                    break;
                case 'B':
                    b.add(i);
                    break;
            }

        }

        r.forEach(i -> {
            g.forEach(j -> {
                b.forEach(k -> {
                    Integer[] a = {i, j, k};
                    Arrays.sort(a);
                    if (a[2] - a[1] == a[1] - a[0]) return;
//                    System.out.printf("%d %d %d", a[0], a[1], a[2]);
//                    System.out.println("");
                    ans.getAndIncrement();
                });
            });
        });

//        for (int i = 0; i < n - 2; i++) {
//            for (int j = i + 1; j < n - 1; j++) {
//                for (int k = j + 1; k < n; k++) {
//                    if (k - j == j - i) continue;
//                    if (s[k] == s[j] || s[j] == s[i] || s[i] == s[k]) continue;
////                    System.out.printf("%d %d %d", i, j, k);
////                    System.out.println("");
//                    ans++;
//                }
//            }
//        }
        System.out.println(ans.get());
    }
}
