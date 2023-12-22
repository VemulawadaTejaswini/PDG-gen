import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static PrintWriter out;

    public static void main(String[] args) {
        Main.run();
    }

    private static void run() {
        out = new PrintWriter(new BufferedOutputStream(System.out));
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        // カードリスト
        ArrayList<Integer> cardlist = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            cardlist.add(Integer.parseInt(sc.next()));
        }
        // カードリストを降順ソート
        Collections.sort(cardlist);
        Collections.reverse(cardlist);
        // アリスとボブの得点
        int alice = 0;
        int bob = 0;
        // アリス→ボブの順で交互に高いカード引く
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                alice += cardlist.get(i);
            } else {
                bob += cardlist.get(i);
            }
        }
        out.println(alice - bob);
        out.close();
        sc.close();
    }

}
