import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cardNum = Integer.parseInt(sc.next());
        int calcNum = Integer.parseInt(sc.next());

        int[] cards = new int[cardNum];
        for (int i = 0; i < cardNum; i++) {
            cards[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < calcNum; i++) {
            Arrays.sort(cards);
            int chaNum = Integer.parseInt(sc.next());
            int nuint = Integer.parseInt(sc.next());

            for(int j = 0; j < chaNum; j++) {
                if(cards[0] < nuint) cards[0] = nuint;
                Arrays.sort(cards);
            }
        }

        long max = 0;
        for (int i : cards) max += i;
        System.out.println(max);
    }
}