
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfFacts = scanner.nextInt();

        long LowerestRank = 0;
        long scores = 0;
        while(numOfFacts > 0) {
            long rank = scanner.nextInt();
            long score = scanner.nextInt();
            if (rank > LowerestRank) {
                LowerestRank = rank;
                scores = score;
            }
            numOfFacts--;
        }

        System.out.println(LowerestRank + scores);

    }
}