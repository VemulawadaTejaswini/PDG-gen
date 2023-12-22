import java.util.*;
import java.math.BigDecimal;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    //scanner
        // 入力受付
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        // 処理
        int h = ty - sy;    // 高さ
        int w = tx - sx;    // 幅

        String ans = "";    // 回答用文字列

        // 計算
        // h回上昇
        for(int i=0; i<h; i++){
            ans += "U";             
        }
        // w+1回右
        for(int i=0; i<w+1; i++){
            ans += "R";
        }
        // h+1回下降
        for (int i=0; i<h+1; i++){
            ans += "D";
        }
        // w+1回左
        for(int i=0; i<w+1; i++){
            ans += "L";
        }
        // 一回上昇し，左へ
        ans += "UL";
        // h+1回上昇
        for(int i=0; i<h+1; i++){
            ans += "U";
        }
        // w+1回右へ
        for (int i=0; i<w+1; i++){
            ans += "R";
        }
        // h+1回下降
        for (int i=0; i<h+1; i++){
            ans += "D";
        }
        // w回左へ
        for(int i=0; i<w; i++){
            ans += "L";
        }

        // 出力
        System.out.println(ans);

    }
}