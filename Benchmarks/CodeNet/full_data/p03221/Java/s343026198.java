import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 県、市の数
        int kenAmount = scan.nextInt();
        int shiAmount = scan.nextInt();

        // 各市の県番号、誕生年、県内での誕生順を格納する2次元配列
        int shi[][] = new int[shiAmount][3];

        // 各市の県番号、誕生年を標準入力から受け取る
        for(int i = 0; i < shi.length; i++) {
            shi[i][0] = scan.nextInt(); //県番号
            shi[i][1] = scan.nextInt(); //誕生年
        }

        // 各市の県内での誕生順を調べる
        for(int i = 0; i < shi.length; i++) {
            // 値を1にセット
            shi[i][2] = 1;

            // i-1番目以前の要素と比較
            for(int j = 0; j < i; j++) {
                // iとjの県番号が同じとき
                if(shi[i][0] == shi[j][0]) {
                    // 誕生順がi, jならjの誕生順をインクリメントする
                    // そうでなければiの誕生順をインクリメントする
                    if(shi[i][1] < shi[j][1]) {
                        shi[j][2]++;
                    } else {
                        shi[i][2]++;
                    }
                }
            }
        }
        
        // 認識番号を出力する
        for(int i = 0; i < shi.length; i++) {
            // 出力するIDをここに格納
            String s = "";
            
            // 6-(県番号の桁数)の回数sの前6桁の先頭に0を追加
            for(int j = 0; j < 6 - (shi[i][0] / 10 + 1); j++) {
                s += "0";
            }

            // sの末尾に県番号を付加
            s += shi[i][0];

            // 6-(誕生順の桁数)の回数sの後ろ6桁の先頭に0を追加
            for(int j = 0; j < 6 - (shi[i][2] / 10 + 1); j++) {
                s += "0";
            }

            // sの末尾に誕生順を付加
            s += shi[i][2];

            // 出力
            System.out.println(s);
        }

        scan.close();
        return;
    }
}