import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 棒の本数
        int N = sc.nextInt();
        // 選ぶ本数
        int K = sc.nextInt();
        // 棒の長さを格納
        Integer[] card = new Integer[N];
        // 棒の長さを入力
        for (int i = 0; i < N; i++) {
            card[i] = sc.nextInt();
        }
        // 降順に並び替える
        Arrays.sort(card, Collections.reverseOrder());

        // 長さの合計値
        int totalLength = 0;
        for (int j = 0; j < K; j++) {
            totalLength = card[j] + totalLength;
        }

        System.out.println(totalLength);

    }
}