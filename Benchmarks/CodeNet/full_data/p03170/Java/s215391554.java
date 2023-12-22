
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

        if (solve(arr[0], items, k, new HashMap<>(), new HashMap<>(), true) == 0) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }

    // return winner id 0 means first
    private static int solve(int min, Set<Integer> choices, int k, Map<Integer, Boolean> firstMemo,
                             Map<Integer, Boolean> secondMemo, boolean firstTurn) {
        if (firstTurn) {
            if (firstMemo.containsKey(k)) return firstMemo.get(k) ? 0 : 1;
        } else {
            if (secondMemo.containsKey(k)) return secondMemo.get(k) ? 1 : 0;
        }

        if (k < min) return firstTurn ? 1 : 0;
        if (choices.contains(k)) return firstTurn ? 0 : 1;
        boolean res = false;

        int myId = firstTurn ? 0 : 1;
        int winnderId = 1 - myId;

        for (int choice : choices) {
            if (solve(min, choices, k - choice, firstMemo, secondMemo, !firstTurn) == myId) {
                res = true;
                winnderId = myId;
                break;
            }
        }

        if (firstTurn) {
            firstMemo.put(k, res);
        } else {
            secondMemo.put(k, res);
        }

        return winnderId;
    }
}
