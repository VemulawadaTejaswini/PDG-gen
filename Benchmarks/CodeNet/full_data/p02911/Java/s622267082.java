import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());
        int[] answer = new int[Q];
        for (int i = 0; i < Q; i++) {
            answer[i] = Integer.parseInt(sc.next());
        }

        Map<Integer, Integer> scoreMap = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            scoreMap.put(i, K);
        }

        for (int i = 0; i < Q; i++) {
            for (int j = 1; j <= N; j++) {
                if (answer[i] != j) {
                    int score = scoreMap.get(j);
                    scoreMap.put(j, score - 1);
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            if (scoreMap.get(i) > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}