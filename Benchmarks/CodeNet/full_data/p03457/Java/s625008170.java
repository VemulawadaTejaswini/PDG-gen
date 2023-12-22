import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        int[][] tn = new int[N][3];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                tn[i][j] = Integer.parseInt(sc.next());
            }

        }

        int x = 0;
        int y = 0;
        int current = 0;
        boolean isRearch = false;
        for (int i = 0; i < N; i++) {
            int dx = Math.abs(tn[i][1] - x);
            int dy = Math.abs(tn[i][2] - y);
            int act = tn[i][0] - current;

            // 距離が行動数未満かどうか
            if (!(act == dx + dy)) {
                if (act % 2 == 0) {
                    // 偶数の場合、差は0だったら到達できる
                    if (dx + dy != 0) {
                        isRearch = false;
                        break;
                    }

                } else if (act % 2 == 1) {
                    // 奇数の場合、差が1だったら到達的できる
                    if (dx + dy != 1) {
                        isRearch = false;
                        break;
                    }
                } else {

                    // 偶数・奇数で条件を満たさないので到達できない
                    isRearch = false;
                    break;
                }
            }

            x = tn[i][1];
            y = tn[i][2];
            current = tn[i][0];
            isRearch = true;
        }

        System.out.println(isRearch ? "Yes" : "No");
    }

}
