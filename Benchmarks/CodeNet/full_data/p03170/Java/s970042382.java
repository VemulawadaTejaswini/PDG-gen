
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        HashSet<Integer> items = new HashSet<>();

        for (int i : arr) {
            items.add(i);
        }
        if (solve(arr[0], items, k, new HashMap<>(), true)) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }

    // only return true if first wins
    private static boolean solve(int min, Set<Integer> choices, int k, Map<Integer, Boolean> memo, boolean firstTurn) {
        if (memo.containsKey(k)) return memo.containsKey(k) && firstTurn;
        if (k < min) return !firstTurn;
        if (choices.contains(k)) return firstTurn;
        boolean res;

        if (firstTurn) {
            res = false;
            for (int choice : choices) {
                if (solve(min, choices, k - choice, memo, !firstTurn)) {
                    res = true;
                    break;
                }
            }
        } else {
            res = true;
            for (int choice : choices) {
                if (!solve(min, choices, k - choice, memo, !firstTurn)) {
                    res = false;
                    break;
                }
            }
        }
        memo.put(k, res);
        return res;
    }
}
