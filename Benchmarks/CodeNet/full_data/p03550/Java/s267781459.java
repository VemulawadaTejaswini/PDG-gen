import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int z = scanner.nextInt();
        int w = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        ArrayList<Integer> candidates = new ArrayList<>();
        boolean cand = true;
        int score = Math.abs(z - a[a.length - 1]);
        for (int i = 0; i < a.length - 1; i++) {
            if (Math.abs(a[a.length - 1] - a[i]) < score) {
                cand = false;
                break;
            }
        }
        if (cand) candidates.add(score);
        for (int i = 0; i < a.length - 1; i++) {
            score = Math.abs(a[i] - a[a.length - 1]);
            cand = true;
            for (int j = i + 1; j < a.length - 1; j++) {
                if (Math.abs(a[a.length - 1] - a[j]) < score) {
                    cand = false;
                    break;
                }
            }
            if (cand && candidates.size() > 0 && score > candidates.get(candidates.size() - 1)) candidates.add(score);
            else if (cand) candidates.add(score);
        }

        if (candidates.size() != 0) System.out.println(Math.max(candidates.get(candidates.size() - 1), Math.abs(w - a[a.length - 1])));
        else System.out.println(Math.abs(w - a[a.length - 1]));
    }
}
