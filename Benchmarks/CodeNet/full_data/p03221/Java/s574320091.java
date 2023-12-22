import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 県の数
        int kenAmount = scan.nextInt();
        int shiAmount = scan.nextInt();

        // 各市の県番号、誕生年、元の順番、ID
        long shi[][] = new long[shiAmount][4];

        // 各市の県番号、誕生年を標準入力から受け取る
        for(int i = 0; i < shi.length; i++) {
            shi[i][0] = scan.nextLong(); //県番号
            shi[i][1] = scan.nextLong(); //誕生年
            shi[i][2] = i;

            int j = i;
            while(j >= 1 && 
                  (shi[j - 1][0] > shi[j][0] || 
                  (shi[j - 1][0] == shi[j][0] && shi[j - 1][1] > shi[j][1]))) {
                long tmp[] = shi[j];
                shi[j] = shi[j - 1];
                shi[j - 1] = tmp;
                j--;
            }
        }
        
        // IDを求める
        long bn = -1;
        for(int i = 0, cnt = 0; i < shi.length; i++) {
            if(shi[i][0] != bn) {
                cnt = 0;
            }

            cnt ++;
            shi[i][3] = 1000000 * shi[i][0] + cnt;
            bn = shi[i][0];

            int j = i;
            while(j >= 1 && shi[j - 1][2] > shi[j][2]) {
                long tmp[] = shi[j];
                shi[j] = shi[j - 1];
                shi[j - 1] = tmp;
                j--;
            }
        }

        // 各市のIDを12桁で出力
        for(int i = 0; i < shi.length; i++) {
            System.out.println(String.format("%012d", shi[i][3]));
        }

        scan.close();
        return;
    }
}