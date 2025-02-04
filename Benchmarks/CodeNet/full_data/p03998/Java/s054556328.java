
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String cardsOfA = input.readLine();
        String cardsOfB = input.readLine();
        String cardsOfC = input.readLine();

        int lengthOfCardsOfA = cardsOfA.length();
        int lengthOfCardsOfB = cardsOfB.length();
        int lengthOfCardsOfC = cardsOfC.length();

        int currentCardPositionOfA = 0;
        int currentCardPositionOfB = 0;
        int currentCardPositionOfC = 0;

        boolean isWinnerDetermined = false;
        char nameOfWinner = ' ';
        char currentPlayer = 'a';
        while (!isWinnerDetermined) {
            if (currentPlayer == 'a') {
                if (doesPlayerFinish(currentCardPositionOfA, lengthOfCardsOfA)) {
                    isWinnerDetermined = true;
                    nameOfWinner = 'a';
                } else {
                    currentPlayer = cardsOfA.charAt(currentCardPositionOfA);
                    currentCardPositionOfA += 1;
                }
            } else if (currentPlayer == 'b') {
                if (doesPlayerFinish(currentCardPositionOfB, lengthOfCardsOfB)) {
                    isWinnerDetermined = true;
                    nameOfWinner = 'b';
                } else {
                    currentPlayer = cardsOfB.charAt(currentCardPositionOfB);
                    currentCardPositionOfB += 1;
                }

            } else if (currentPlayer == 'c') {
                if (doesPlayerFinish(currentCardPositionOfC, lengthOfCardsOfC)) {
                    isWinnerDetermined = true;
                    nameOfWinner = 'c';
                } else {
                    currentPlayer = cardsOfC.charAt(currentCardPositionOfC);
                    currentCardPositionOfC += 1;
                }
            }
        }

        System.out.println(nameOfWinner);


    }

    private static boolean doesPlayerFinish(int currentCardPositionOfThePlayer, int lengthOfCardsOfThePlayer) {
        return currentCardPositionOfThePlayer >= lengthOfCardsOfThePlayer;
    }

}
