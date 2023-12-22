import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        ArrayList<Integer> board = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            board.add(cin.nextInt());
        }

        int num = cin.nextInt();

        for (int i = 0; i < num; i++) {
            int temp = cin.nextInt();
            int index = board.indexOf(temp);
            while (index != -1) {
                board.set(index, 0);
                index = board.indexOf(temp);
            }
        }

        if (bingo(board)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean bingo(ArrayList<Integer> board) {
        for (int i = 0; i < 3; i++) {
            if (board.get(3 * i) == 0 && board.get(1 + 3 * i) == 0 && board.get(2 + 3 * i) == 0) {
                return true;
            }
            if (board.get(i) == 0 && board.get(i + 3) == 0 && board.get(i + 6) == 0) {
                return true;
            }
        }
        if (board.get(0) == 0 && board.get(4) == 0 && board.get(8) == 0) {
            return true;
        }
        if (board.get(2) == 0 && board.get(4) == 0 && board.get(6) == 0) {
            return true;
        }

        return false;
    }

}
