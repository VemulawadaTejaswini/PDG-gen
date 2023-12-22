import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> haveProblems = new HashMap<>();
        Map<Integer, Integer> needProblems= new HashMap<>();

        int have = scanner.nextInt();
        for (int i = 0; i < have; i++) {
            int tmp = scanner.nextInt();
            if (haveProblems.containsKey(tmp))
                haveProblems.put(tmp, haveProblems.get(tmp) + 1);

            haveProblems.put(tmp, 1);
        }

        int need = scanner.nextInt();

        for (int j = 0; j < need; j++) {
            int tmpp = scanner.nextInt();
            if (haveProblems.containsKey(tmpp) && haveProblems.get(tmpp) > 0) {
                haveProblems.put(tmpp, haveProblems.get(tmpp) - 1);
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }
}