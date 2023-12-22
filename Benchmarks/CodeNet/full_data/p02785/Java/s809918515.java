import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // 入力データの取得
        Scanner scanner = new Scanner(System.in);
        String inputDataRow1 = scanner.nextLine();
        String inputDataRow2 = scanner.nextLine();
        scanner.close();

        // 入力データの編集
        String[] editedInputDataRow1 = inputDataRow1.split(" ");
        int enemyCount = Integer.parseInt(editedInputDataRow1[0]);
        int skillCount = Integer.parseInt(editedInputDataRow1[1]);

        // モンスターの数で処理を分岐させる
        long totalDamageDemand = 0;
        if (enemyCount != 1) {
            String[] editedInputDataRow2 = inputDataRow2.split(" ");
            long[] enemyHPList = new long[enemyCount];
            for (int index = 0; index < enemyCount; index++) {
                enemyHPList[index] = Long.parseLong(editedInputDataRow2[index]);
            }

            // モンスターのHPをソートする
            // 昇順
            Arrays.sort(enemyHPList);

            // 必要攻撃回数の判定
            enemyCount -= skillCount;
            for (int index = 0; index < enemyCount; index++) {
                totalDamageDemand += enemyHPList[index];
            }

        } else {
            long enemyHP = Long.parseLong(inputDataRow2);
            if (skillCount == 0) {
                totalDamageDemand = enemyHP;
            } else {
                totalDamageDemand = 0;
            }
        }

        // 結果の出力
        System.out.println(totalDamageDemand);

    }

}