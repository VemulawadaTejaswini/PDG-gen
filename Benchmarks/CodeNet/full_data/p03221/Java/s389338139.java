import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 県、市の数
        int kenAmount = scan.nextInt();
        int shiAmount = scan.nextInt();

        // 各市の県番号、誕生年、認識番号(12桁の整数)を格納する2次元配列
        long shi[][] = new long[shiAmount][3];

        // 各市の県番号、誕生年を標準入力から受け取り、認識番号を0にする
        for(int i = 0; i < shi.length; i++) {
            shi[i][0] = scan.nextLong(); //県番号
            shi[i][1] = scan.nextLong(); //誕生年 
            shi[i][2] = 0;
        }

        // 各要素の認識番号上6桁を県番号に応じて決める
        for(int i = 0; i < shi.length; i++) {
            shi[i][2] += shi[i][0] * 1000000;
        }

        // 各要素の認識番号下6桁を決める
        for(int i = 0; i < shi.length; i++) {
            // 認識番号の下6桁を000001にセット
            shi[i][2] += 1;

            // i-1番目以前の要素と比較
            for(int j = 0; j < i; j++) {
                // 県番号が等しいとき
                if(shi[i][0] == shi[j][0]) {
                    // 誕生順がi, jのとき、j番目の下6桁を1つ増やす
                    if(shi[i][1] < shi[j][1]) {
                        shi[j][2] += 1;
                    }

                    // 誕生順がj, iのとき、i番目の下6桁を1つ増やす
                    if(shi[i][1] > shi[j][1]) {
                        shi[i][2] += 1;
                    }
                }
            }
        }
        
        // 各要素の認識番号を12桁で出力する
        for(int i = 0; i < shi.length; i++) {
            System.out.println(String.format("%012d", shi[i][2]));
        }

        scan.close();
        return;
    }
}