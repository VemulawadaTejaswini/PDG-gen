import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] cards = new long[n];
        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        int pairCount = 0;
        for (int i = 0; i < n; i++) {
            long prevMin = 0, nextMin = 0;
            long prevPair = 0, prevCurrentPair = 0, nextCurrentPair = 0, nextPair = 0;
            if (i > 0) {
                prevMin = Math.min(cards[i - 1], cards[i]);
                prevMin = prevMin > 0 ? prevMin : 0;
                prevPair = (cards[i - 1] - prevMin) / 2;
                prevCurrentPair = (cards[i] - prevMin) / 2;
            } else if(i < n - 1) {
                nextMin = Math.min(cards[i], cards[i + 1]);
                nextMin = nextMin > 0 ? nextMin : 0;
                nextPair = (cards[i + 1] - nextMin) / 2;
                nextCurrentPair = (cards[i] - nextMin) / 2;
            }

            long prev = prevMin + prevPair + prevCurrentPair;
            long next = nextMin + nextPair + nextCurrentPair;

            if (prev >= next) {
                cards[i - 1] -= prevMin + prevPair * 2;
                cards[i] -= prevMin + prevCurrentPair * 2;
                pairCount += prev;
            } else if (next > prev) {
                cards[i] -= nextMin + nextCurrentPair * 2;
                cards[i + 1] -= nextMin + nextPair * 2;
                pairCount += next;
            }
        }

        System.out.println(pairCount);
    }
}