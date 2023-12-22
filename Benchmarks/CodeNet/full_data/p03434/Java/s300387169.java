import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        ArrayList<Integer> cards = new ArrayList<>();
        for(int i = 0;i < n; i++) {
        cards.add(sc.nextInt());
        }

        List<Integer> sortedCards = cards.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        int alicePoints = 0;
        int bobPoints = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                alicePoints += sortedCards.get(i);
            } else {
                bobPoints += sortedCards.get(i);
            }
        }
        System.out.println(alicePoints - bobPoints);
    }
}