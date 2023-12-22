import java.util.*;
import java.util.stream.Collectors;

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
        int N = Integer.parseInt(scanner.next());
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.next();
        }
        Arrays.sort(S, String::compareTo);

        int maxCnt = 0;
        int cnt = 0;
        String prev = null;
        for (int i = 0; i < N; i++) {
            if (prev == null || prev.equals(S[i])) {
                prev = S[i];
                cnt++;
            } else {
                maxCnt = Math.max(maxCnt, cnt);
                prev = S[i];
                cnt = 1;
            }
        }
        maxCnt = Math.max(maxCnt, cnt);

        cnt = 0;
        prev = null;
        List<String> sb = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (prev == null || prev.equals(S[i])) {
                prev = S[i];
                cnt++;
                if (cnt == maxCnt) {
                    sb.add(prev);
                    prev = null;
                    cnt = 0;
                }
            } else {
                prev = S[i];
                cnt = 1;
            }
        }

        if (cnt == maxCnt) {
            sb.add(prev);
        }

        System.out.println(String.join("\n", sb));
    }

}

