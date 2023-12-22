import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = cin.nextInt();
            B[i] = cin.nextInt();
            C[i] = cin.nextInt();
        }

        int sum = 0; //これまでの合計満足度
        int preChoice = -1; //前の行動
        for (int i = 0; i < N; i++) {
            //一番良い行動を記録する
            int bestChoice = -1;
            int bestPoint = -99999;
            // Aを選んだ場合
            if (preChoice != 0 && bestPoint < A[i]) {
                bestChoice = 0;
                bestPoint = A[i];
            }
            // Bを選んだ場合
            if (preChoice != 1 && bestPoint < B[i]) {
                bestChoice = 1;
                bestPoint = B[i];
            }
            // Cを選んだ場合
            if (preChoice != 2 && bestPoint < C[i]) {
                bestChoice = 2;
                bestPoint = C[i];
            }
            //どれが一番良かったかが決まったら、それで値を更新する
            sum += bestPoint;
            preChoice = bestChoice;
        }
        System.out.println(sum);
    }
}
