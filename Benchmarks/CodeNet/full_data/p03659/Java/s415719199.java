import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cardCounts = sc.nextInt();

        int cards[] = IntStream
                .range(0, cardCounts)
                .map(v -> sc.nextInt())
                .toArray();

        int halfTotal = IntStream.of(cards).sum() / 2;

        int sunukeCardCounts = 0;
        int sunukeTotal = 0;
        for (; sunukeCardCounts < cardCounts; sunukeCardCounts++) {
            sunukeTotal += cards[sunukeCardCounts];

            if (sunukeTotal >= halfTotal) break;
        }

        int araiTotal = 0;
        for (int araiCardCounts = sunukeCardCounts + 1; araiCardCounts < cardCounts; araiCardCounts++) {
            araiTotal += cards[araiCardCounts];
        }

        int result = sunukeTotal - araiTotal;
        if (result < 0) {
            result *= -1;
        }

        System.out.printf(Integer.toString(result));
    }

}
