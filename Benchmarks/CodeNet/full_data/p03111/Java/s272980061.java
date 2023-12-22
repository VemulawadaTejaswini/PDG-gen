import java.util.Scanner;

public class Main {

    int N, A, B, C;
    int[] len;

    void solve() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        len = new int[N];

        for (int i = 0; i < N; i++) {
            len[i] = sc.nextInt();
        }
        int ans = calcMinMP(0, 0, 0, 0);
        System.out.print(ans);
    }

    // Aの長さがlenA、 Bの長さがlenB、Cの長さがlenCの時、curIndex 以降の材料を使って算出した最小のMP。
    int calcMinMP(int curIndex, int lenA, int lenB, int lenC) {
        // 最後の len[i] まで処理したので、ここで最小値を計算してreturnする。脱出条件。
        if (curIndex == N) {
            if (Math.min(Math.min(lenA, lenB), lenC) > 0) {
                int MP = (Math.abs(A - lenA) - 10) + (Math.abs(B - lenB) - 10) + (Math.abs(C - lenC) - 10);
                return MP;
            }
            else {
                // throw new IllegalStateException();
                return (int)Math.pow(10,9);
            }
        }

        // まだ処理すべきlen[i]があるので、次に行く。

        int resultA    = calcMinMP(curIndex + 1, lenA + len[curIndex], lenB, lenC) + 10;
        int resultB    = calcMinMP(curIndex + 1, lenA, lenB + len[curIndex], lenC) + 10;
        int resultC    = calcMinMP(curIndex + 1, lenA, lenB, lenC + len[curIndex]) + 10;
        int resultNone = calcMinMP(curIndex + 1, lenA, lenB, lenC);
        return Math.min(resultA, Math.min(resultB, Math.min(resultC, resultNone)));
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}