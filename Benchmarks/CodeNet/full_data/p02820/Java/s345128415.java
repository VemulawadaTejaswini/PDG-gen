import java.util.*;
public class Main2 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

		// 整数の入力
        int n = sc.nextInt();   //じゃんけん回数
        int k = sc.nextInt();   //同じ手禁止間隔
        int[] sco = new int[3];
        sco[0] = sc.nextInt();   //グー得点
        sco[1] = sc.nextInt();   //チョキ得点
        sco[2] = sc.nextInt();   //パー得点
        String t = sc.next(); //ゲームの手
        int ngte = -1;//出しちゃいけないやつ
        long score = 0;

        //N回じゃんけん
        for (int i = 0; i < n; i++) {
            int te = 0; //r:0,t:1,s:2
            if (t.charAt(i) == 'r') {//グーならパー
                te = 2;
            } else if (t.charAt(i) == 's') {//パーならチョキ
                te = 1;
            }
            //禁じ手チェック
            if (te == ngte) {
                //負けが確定するので0点
                //次勝てるように負けておく
                if (i + k < n) {
                    if( te == 0 )
                        if( t.charAt(i) == 'p' )//次チョキ出せば勝てる
                            te = 2; //パー出しておく
                        else
                            te = 1; //チョキ出しておく
                    if( te == 1 )
                        if( t.charAt(i) == 's' )//次グー出せば勝てる
                            te = 2; //パー出しておく
                        else
                            te = 0; //グー出しておく
                    if( te == 2 )
                        if( t.charAt(i) == 'r' )//次パー出せば勝てる
                            te = 1; //チョキ出しておく
                        else
                            te = 0; //グー出しておく
                }
            } else {
                score += sco[te];
            }

            if (i == 0 || i % k == 0) {
                ngte = te;
            }
        }
        System.out.println(score);
	}
}