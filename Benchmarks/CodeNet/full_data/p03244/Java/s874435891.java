import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = in.nextInt();
        }
        Map<Integer, Integer> odds = new HashMap<>();
        Map<Integer, Integer> evens = new HashMap<>();

        int replacements = 0;

        for (int i = 0; i < n; i += 2) {
            odds.put(v[i], odds.getOrDefault(v[i], 0) + 1);
        }

        for (int i = 1; i < n; i += 2) {
            evens.put(v[i], evens.getOrDefault(v[i], 0) + 1);
        }

        int bestOdd = v[0];
        int bestOddVal = odds.get(bestOdd);
        for (int key : odds.keySet()) {
            if (odds.get(key) > odds.get(bestOdd)) {
                bestOdd = key;
                bestOddVal = odds.get(key);
            }
        }
        int bestEven = v[1];
        int bestEvenVal = evens.get(bestEven);
        for (int key : evens.keySet()) {
            if (evens.get(key) > evens.get(bestEven)) {
                bestEven = key;
                bestEvenVal = evens.get(key);
            }
        }

        if (bestOdd == bestEven) {
            if (odds.size() <= 1 && evens.size() <= 1) {
                System.out.println(n / 2);
                return;
            }
            if (odds.size() > 1 && evens.size() > 1) {
                odds.remove(bestOdd);
                evens.remove(bestEven);
                int secondBestOdd = Collections.max(odds.values());
                int secondBestEven = Collections.max(evens.values());
                if (secondBestOdd > secondBestEven) {
                    bestOddVal = secondBestOdd;
                }
                else {
                    bestEvenVal = secondBestEven;
                }
            }
            else if (odds.size() <= 1) {
                evens.remove(bestEven);
                bestEvenVal = Collections.max(evens.values());
            }
            else {
                odds.remove(bestOdd);
                bestOddVal = Collections.max(odds.values());
            }
        }

        replacements += (n + 1) / 2 - bestOddVal;
        replacements += n / 2 - bestEvenVal;

        System.out.println(replacements);
    }
}
