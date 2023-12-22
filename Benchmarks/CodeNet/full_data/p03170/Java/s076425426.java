
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

        if (solve(arr[0], items, k, new HashMap<>(), true) == 0) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }

    // return winner id 0 means first
    private static int solve(int min, Set<Integer> choices, int k, Map<Integer, Integer> winnerMemo, boolean firstTurn) {
        if (winnerMemo.containsKey(k)) return winnerMemo.get(k);

        int myId = firstTurn ? 0 : 1;
        int otherId = 1 - myId;

        if (k < min) return otherId;
        if (choices.contains(k)) return myId;

        int winnerId = otherId;

        for (int choice : choices) {
            if (solve(min, choices, k - choice, winnerMemo, !firstTurn) == myId) {
                winnerId = myId;
                break;
            }
        }
        winnerMemo.put(k, winnerId);
        return winnerId;
    }
}