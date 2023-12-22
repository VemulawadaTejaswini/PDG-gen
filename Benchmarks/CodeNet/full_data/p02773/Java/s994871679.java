
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> votes = new HashMap<>();
        int gothru = sc.nextInt();
        int max = -999;
        for (int i = 0; i<gothru;i++) {
            String cur = sc.next();
            if (votes.containsKey(cur)) {
                int was = votes.get(cur);
                votes.put(cur, was+1);
                if ((was + 1) > max) {
                    max = (was + 1);
                }
            } else {
                votes.put(cur, 1);
            }
        }
        for (Map.Entry<String, Integer> e : votes.entrySet()) {
            if (e.getValue() == max) {
                System.out.println(e.getKey());
            }
        }
    }
}
