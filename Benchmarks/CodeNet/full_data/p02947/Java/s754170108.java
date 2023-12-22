import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        String[] s = new String[n];

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        for (String s1 : s) {
            char[] c = s1.toCharArray();
            Arrays.sort(c);
            String sorted = String.valueOf(c);
            map.put(sorted, map.getOrDefault(sorted, 0) + 1);
        }

        int ans = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int t = entry.getValue();
            ans += t * (t - 1) / 2;
        }
        System.out.println(ans);
    }
}

