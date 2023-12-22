import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        Map<Integer, Integer> d = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            if (d.containsKey(key)) {
                d.put(key, d.get(key) + 1);
            } else {
                d.put(key, 1);
            }
        }
        sc.nextLine();

        int m = sc.nextInt();
        sc.nextLine();
        int t[] = new int[m];
        for (int i = 0; i < m; i++) {
            t[i] = sc.nextInt();
        }
        sc.close();

        if (m > n) {
            System.out.println("NO");
            System.exit(0);
        }

        for (int i = 0; i < m; i++) {
            if (d.containsKey(t[i])) {
                if (d.get(t[i]) != 0) {
                    d.put(t[i], d.get(t[i]) - 1);
                } else {
                    System.out.println("NO");
                    System.exit(0);
                }
            } else {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
}
