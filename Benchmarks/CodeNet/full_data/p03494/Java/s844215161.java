import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(" ");

        // 回数カウンタ
        int count = 0;
        // 数字が2で割り切れなくなるまでループを繰り返す
        while(true){
            // 入力すべてが2で割り切れるかどうかを確かめる
            for(int i = 0;i < n;i++){
                int tmp = Integer.parseInt(input[i]);
                // 2で割り切れる時、数字を置き換える
                if(tmp % 2 == 0) {
                    input[i] = Integer.toString(tmp/2);
                // ２で割り切れない時、そこでループを終了する
                } else {
                    // ２で割り切れなくなったときだけ結果を出力
                    System.out.println(count);
                    return;
                }
            }
            
            // すべてループを回ったら2で割り切れているのでカウントアップ
            count++;
        }
    }
}
