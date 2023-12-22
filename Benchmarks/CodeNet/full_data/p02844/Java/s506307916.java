import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        Map<Integer, List<Integer>> m = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            m.put(i, new ArrayList<>());
        }

        int N = Integer.parseInt(scanner.nextLine());
        String S = scanner.nextLine();
        for (int i = 0; i < S.length(); i++) {
            m.get(S.charAt(i) - '0').add(i);
        }

        int ans = 0;
        for (int i = 0; i < 10; i++) {
            if (m.get(i).size() == 0) {
                continue;
            }
            int first = m.get(i).get(0);
            for (int j = 0; j < 10; j++) {
                int second = Collections.binarySearch(m.get(j), first + 1);
                if (second < 0) {
                    second = -(second + 1);
                }
                if (second == m.get(j).size()) {
                    continue;
                }
                second = m.get(j).get(second);
                for (int k = 0; k < 10; k++) {
                    int third  = Collections.binarySearch(m.get(k), second + 1);
                    if (third < 0) {
                        third = -(third + 1);
                    }
                    if (third < m.get(k).size()) {
                        ans++;
                    }
                }
            }
        }

        System.out.println(ans);
    }

}
