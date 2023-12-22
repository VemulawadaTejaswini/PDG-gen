import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int MOD = (int)998244353;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++) {
            int tmp = sc.nextInt();
            if (map.containsKey(tmp)) {
                map.remove(tmp);
            } else {
                map.put(tmp, 1);
            }
        }

        System.out.println(map.size());

    }
}

