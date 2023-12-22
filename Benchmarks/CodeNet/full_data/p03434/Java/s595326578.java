import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] cards = new Integer[n];
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(cards, Comparator.reverseOrder());
        int alice = 0;
        int bob = 0;
        for (int i = 0; i < n; i++) {
            if (1 == 0 || i % 2 == 0) {
                alice += cards[i];
            } else {
                bob += cards[i];
            }
        }
        System.out.println(alice - bob);
    }
}
