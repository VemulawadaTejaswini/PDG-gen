import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        
        int yusha = s.nextInt();
        int monsters[] = new int[yusha + 1];
        int strength[] = new int[yusha];

        // モンスターを倒した数
        int count = 0;

        for (int i = 0; i < yusha+1; i++) {
            monsters[i] = s.nextInt();
        }

        for (int i = 0; i < yusha; i++) {
            strength[i] = s.nextInt();

            if (monsters[i] >= strength[i]) {
                count += strength[i];
            } else {
                count += monsters[i];
                monsters[i+1] -= (strength[i] - monsters[i]);
            }
        }

        // for (int i = 0; i < yusha; i++) {
        //     strength[i] = s.nextInt();

        //     for (int j = 0; j < 2; j++) {
        //         // モンスターの数が勇者の撃退可能数と同等、あるいは多い場合
        //         if (monsters[i+j] >= (strength[i] + yoryoku)) {
        //             count += strength[i] + yoryoku; // 倒せる限り倒す
        //             monsters[i+j] = monsters[i+j] - (strength[i] + yoryoku);

        //             // 勇者の力は０
        //             strength[i] = 0;
        //             yoryoku = 0;
        //         } else {
        //             // モンスターをすべて倒す
        //             count += monsters[i+j];
        //             // 残り撃退可能数
        //             yoryoku = strength[i] - monsters[i+j];
        //             strength[i] = 0;    //余力を計算しているので０とする

        //             if (j == 1) {
        //                 // 勇者が2つ目の街に来た時、すべてモンスターを倒す
        //                 // 次の勇者が倒すモンスターは残っていない
        //                 monsters[i+j] = 0;
        //             }
        //         }
        //     }
        //     // 勇者の余力の初期化
        //     yoryoku = 0;
        // }

        System.out.println(count);
    }
}