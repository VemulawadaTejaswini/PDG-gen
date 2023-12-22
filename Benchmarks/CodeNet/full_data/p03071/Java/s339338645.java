import java.util.Scanner;
import javafx.util.Pair;

public class Main {

    private static int AMOUNT = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] abt = sc.nextLine().split(" ");
        int A = Integer.parseInt(abt[0]);
        int B = Integer.parseInt(abt[1]);

        Pair<Integer, Integer> pair = new Pair<>(A, B);
        for (int i = 0; i < 2; i++) {
            pair = pick(pair);
        }

        System.out.println(AMOUNT);
    }

    private static Pair<Integer, Integer> pick(Pair<Integer, Integer> pair) {
        if (pair.getKey() == pair.getValue()) {
            AMOUNT += pair.getKey();
            return new Pair<Integer, Integer>(pair.getKey() - 1, pair.getValue());
        } else if (pair.getKey() > pair.getValue()) {
            AMOUNT += pair.getKey();
            return new Pair<Integer, Integer>(pair.getKey() - 1, pair.getValue());
        } else {
            AMOUNT += pair.getValue();
            return new Pair<Integer, Integer>(pair.getKey(), pair.getValue() - 1);
        }
    }
}
