import java.util.*;

public class Main {

    void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n;i++) {
            set.add(sc.nextInt());
        }

        String ans;
        if (set.size() != 3 || n % 3 != 0) {
            ans = "No";
        } else {
            Integer[] arr = set.toArray(new Integer[0]);

            int a1 = arr[0];
            int a2 = arr[1];
            int a3 = arr[2];

            if (a1 == (a2 ^ a3)) {
                ans = "Yes";
            } else {
                ans = "No";
            }
        }

        System.out.println(ans);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
