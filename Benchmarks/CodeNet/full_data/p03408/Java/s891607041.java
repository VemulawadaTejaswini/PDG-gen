import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            HashMap<String, Integer> card = new HashMap<>();
            for (int i = 0; i < N; i++) {
                String s = in.next();
                Integer count = card.get(s);
                card.put(s, 1 + (count == null ? 0 : count.intValue()));
            }
            int M = in.nextInt();
            for (int i = 0; i < M; i++) {
                String s = in.next();
                Integer count = card.get(s);
                card.put(s, -1 + (count == null ? 0 : count.intValue()));
            }

            int max = (int) -1e9;
            for (String s : card.keySet()) {
                max = Math.max(max, card.get(s).intValue());
            }
            System.out.println(max);
        }
    }
}
