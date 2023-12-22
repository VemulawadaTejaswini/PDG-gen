import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> blueCards = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String tmpString = sc.next();
            if (blueCards.containsKey(tmpString)) {
                blueCards.put(tmpString, blueCards.get(tmpString)+1);
            } else {
                blueCards.put(tmpString, 1);
            }
        }

        int m = sc.nextInt();
        HashMap<String, Integer> redCards = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String tmpString = sc.next();
            if (redCards.containsKey(tmpString)) {
                redCards.put(tmpString, redCards.get(tmpString) + 1);
            } else {
                redCards.put(tmpString, 1);
            }
        }

        int coin = 0;
        for (Map.Entry<String, Integer> entry: blueCards.entrySet()) {
            int tmpCoin = entry.getValue();
            if (redCards.containsKey(entry.getKey())) {
                tmpCoin -= redCards.get(entry.getKey());
            }

            if (coin < tmpCoin) coin = tmpCoin;
        }

        System.out.println(coin);
    }
}
