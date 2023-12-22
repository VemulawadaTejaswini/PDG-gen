import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //処理抜けフラグ右
        Boolean right_Flag = false;
        //処理抜けフラグ左
        Boolean left_Flag = false;
        int right_Ans = 0;
        int left_Ans = 0;
        //最小値
        int min_number = 0;
		//入力Nを取得
        int N = sc.nextInt();
        //入力Kを取得
        int K = sc.nextInt();
        //数列を取得（最初の一回はループ外）
        int min = sc.nextInt();
        for(int i = 1;i < N;i++){
            int min_tmp = sc.nextInt();
            //最小値か判定
            if(min < min_tmp){
                //最小値を格納
                min = min_tmp;
                //最小値の番号を格納
                min_number = i;
            }
        }
        //左ようの計算に最小値番号を取っておく
        int min_number_left = min_number;
        //最小値から右半分を最小値に変えていく
        for(int j = 0;;j++){
            //少なくなっちゃったら終わる
            if(min_number + K - 1 >= N){
                right_Ans =  j + 1;
                break;
            }
            min_number = min_number + K - 1;
        }
        //左半分も行う
        for(int j = 0;;j++){
            //少なくなっちゃったら終わる
            if(min_number_left - (K - 1) <= 1){
                left_Ans =  j + 1;
                break;
            }
            min_number_left = min_number_left - (K - 1);
        }
        // 出力
        System.out.println(left_Ans + right_Ans);
	}
}