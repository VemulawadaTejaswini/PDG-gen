import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // problems
        int M = sc.nextInt();   // submissions

        Set<Integer> s = new HashSet<>();
        int wa = 0;
        int ac = 0;

        for (int i = 0; i < M; i++) {
            int problemId = sc.nextInt();
            String ans = sc.nextLine().trim();
            if (!s.contains(problemId)) {
                if ("AC".equals(ans)) {
                    ac++;
                    s.add(problemId);
                } else {
                    wa++;
                }
            }
        }
        System.out.println(ac + " " + wa);
    }
}
