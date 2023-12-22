import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] scores = new String[3];
        for (int i = 0; i < 3; i++) {
            scores[i] = sc.next();
        }
        Arrays.sort(scores, Comparator.reverseOrder());
        String big = scores[0] + scores[1];
        String small = scores[2];
        System.out.println(Integer.parseInt(big) + Integer.parseInt(small));
    }
}
