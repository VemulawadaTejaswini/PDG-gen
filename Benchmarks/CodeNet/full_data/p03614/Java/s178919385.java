import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        boolean c = false;
        for (int i = 1; i <= n; i++) {
            int p = scanner.nextInt();
            if (p == i) {
                if (c) {
                    list.set(0, list.get(0) + 1);
                } else {
                    list.add(0, 1);
                }
                c = true;
            } else {
                c = false;
            }
        }
        int ans = 0;
        for (int i : list) {
            ans += (i + 1) / 2;
        }
        System.out.println(ans);
    }
}