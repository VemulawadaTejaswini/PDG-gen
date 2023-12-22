import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Score> scores = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String s = sc.next();
            int p = sc.nextInt();
            scores.add(new Score(s, p, i));
        }
        Collections.sort(scores, (e1, e2) -> {
            if (!e1.s.equals(e2.s)) {
                return e1.s.compareTo(e2.s);
            } else {
                return e2.score - e1.score;
            }
        });
//        System.out.println(scores);
        for (Score score : scores) {
            System.out.println(score.no);
        }

        sc.close();
    }

    static class Score {
        String s;
        int score;
        int no;

        Score(String s, int score, int no) {
            this.s = s;
            this.score = score;
            this.no = no;
        }

        @Override
        public String toString() {
            return "(s=" + s + ", score=" + score + ", no=" + no + ")";
        }
    }
}
