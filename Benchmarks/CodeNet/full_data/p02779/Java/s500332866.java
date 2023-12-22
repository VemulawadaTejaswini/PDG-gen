import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        Set<Long> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            long a = sc.nextInt();
            if (set.contains(a)) {
                System.out.println("NO");
                return;
            }
            set.add(a);
        }
        System.out.println("YES");
    }
}
