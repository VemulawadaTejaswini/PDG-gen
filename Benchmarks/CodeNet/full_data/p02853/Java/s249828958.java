import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        sc.close();

        // 主処理
        int result = getPrize(x) + getPrize(y);
        if (x == 1 && y == 1) {
            result += 400000;
        }

        // 出力
        System.out.println(result);
    }

    public static int getPrize(int rank) {
        if (rank == 1) {
            return 300000;
        } else if (rank == 2) {
            return 200000;
        } else if (rank == 3) {
            return 100000;
        }
        return 0;
    }
}
