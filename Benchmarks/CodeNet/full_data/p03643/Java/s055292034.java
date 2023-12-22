import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner
        Scanner sc = new Scanner(System.in);

        // ロード
        int N = Integer.parseInt(sc.next());

        // 処理・出力
        int[] mod2Cand = { 64, 32, 16, 8, 4, 2, 1 };
        for (int i = 0; i < mod2Cand.length; i++) {
            if (N >= mod2Cand[i]) {
                System.out.println(mod2Cand[i]);
                sc.close();
                return;
            }
        }

        // scanner
        sc.close();
    }
}