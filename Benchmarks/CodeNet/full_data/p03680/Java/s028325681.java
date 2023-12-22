import java.util.Scanner;

public class Main {

    static int ANS = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[] an = new int[N];
        boolean[] hasPushed = new boolean[N];
        for (int i = 0; i < N; i++) {
            an[i] = Integer.parseInt(sc.next());
        }

        boolean canComp = true;
        int next = 0;
        for (int i = 0; i < N; i++) {
            if (hasPushed[next]) {
                // 既に押したボタンの場合はループしているので終了する
                canComp = false;
                break;
            }
            next = push(an, next, hasPushed);

            if (next == 1) {
                // ボタン2に到達したので終わる
                break;
            }
        }
        System.out.println(canComp ? ANS : -1);
    }

    private static int push(int[] an, int next, boolean[] hasPushed) {
        ANS++;
        hasPushed[next] = true;
        return an[next] - 1;
    }
}
