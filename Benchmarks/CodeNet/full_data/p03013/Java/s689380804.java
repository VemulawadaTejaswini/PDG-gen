import java.util.*;

public class Main {

    public static List<List<Integer>> switchList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> brokenTyles = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            brokenTyles.add(sc.nextInt());
        }

        long[] patterns = new long[N + 1];
        patterns[0] = 0;
        if (brokenTyles.contains(1)) {
            patterns[1] = 0;
        } else {
            patterns[1] = 1;
        }

        if (N > 1) {
            if (brokenTyles.contains(2)) {
                patterns[2] = 0;
            } else {
                patterns[2] = 2;
            }
        }

        for (int i = 3; i <= N; i++) {
            if (brokenTyles.contains(i)) {
                patterns[i] = 0;
            } else {
                patterns[i] = patterns[i - 1] + patterns[i - 2];
                if (patterns[i] == 0) {
                    patterns[N] = 0;
                    break;
                }
            }
        }

        long val = patterns[N];
        long baseVal = (long) Math.pow(10, 9) + 7;
        System.out.println(val % baseVal);
    }

}
