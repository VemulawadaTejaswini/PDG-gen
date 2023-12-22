import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> card = new ArrayList<>(9);
        for (int i = 0; i < 9; i++) {
            card.add(sc.nextInt());
        }
        int count = sc.nextInt();
        int res = 0;
        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            int index = card.indexOf(num);
            if (-1 < index) {
                res += Math.pow(2, index);
            }
        }
        int[] yesArr = {7, 56, 448, 73, 146, 292, 273, 84};
        boolean bingo = false;
        for (int yes : yesArr) {
            if ((res) == yes) {
                bingo = true;
                break;
            }
        }
        System.out.println(bingo ? "Yes" : "No");
    }
}