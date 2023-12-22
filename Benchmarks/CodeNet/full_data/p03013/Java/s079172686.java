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

        int[] patterns = new int[N + 1];
        patterns[0] = 0;
        patterns[1] = 1;
        patterns[2] = 2;

        for (int i = 3; i <= N; i++) {
            if (brokenTyles.contains(i)) {
                patterns[i] = 0;
            } else {
                patterns[i] = patterns[i - 1] + patterns[i - 2];
            }
        }

        System.out.println(patterns[N]);

    }

}