import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by zzt on 17-1-22.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Contestant> contestants = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            contestants.add(new Contestant(null));
        }
        for (int i = 1; i < N; i++) {
            Contestant contestant = contestants.get(i);
            contestant.defeatedBy = contestants.get(scanner.nextInt() - 1);
            contestant.defeatedBy.matchCount++;
            contestant.matchCount+=contestant.defeatedBy.matchCount;

        }
        int ret = 0;
        for (int i = 0; i < N; i++) {
            ret = Math.max(ret, contestants.get(i).matchCount);
            System.out.println(contestants.get(i).matchCount);
        }

        System.out.println(ret);
    }

    static class Contestant {
        Contestant defeatedBy;
        int matchCount = 0;

        Contestant(Contestant defeatedBy) {
            this.defeatedBy = defeatedBy;
        }
    }
}