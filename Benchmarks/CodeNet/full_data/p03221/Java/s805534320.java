import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 県、市の数
        int kenAmount = scan.nextInt();
        int shiAmount = scan.nextInt();

        // 各市の県番号、誕生年、県内での誕生順を格納する2次元配列
        int shi[][] = new int[shiAmount][3];

        // 各市の認識番号(ID)を格納する配列
        long shiID[] = new long[shiAmount]; 

        // 各市の県番号、誕生年を標準入力から受け取り、誕生順と認識番号を0にセットする
        for(int i = 0; i < shi.length; i++) {
            shi[i][0] = scan.nextInt(); //県番号
            shi[i][1] = scan.nextInt(); //誕生年 
            shi[i][2] = 0; //誕生順
            shiID[i]  = 0; //ID
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
        
        // 各市のIDを県番号と誕生順をもとに求めてshiIDに格納し、12桁で出力する
        for(int i = 0; i < shi.length; i++) {
            shiID[i] = 1000000 * shi[i][0] + shi[i][2];
            System.out.println(String.format("%012d", shiID[i]));
        }

        scan.close();
        return;
    }
}