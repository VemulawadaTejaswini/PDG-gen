import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());

        int countAnswer = Q - K;
        Map<Integer, Integer> scoreMap = new HashMap<>();
        for (int i = 0; i < Q; i++) {
            int ans = Integer.parseInt(sc.next());
            int score = scoreMap.getOrDefault(ans, 0);
            scoreMap.put(ans, score + 1);
        }

        for (int i = 1; i <= N; i++) {
            if (scoreMap.getOrDefault(i, -countAnswer) <= countAnswer) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}