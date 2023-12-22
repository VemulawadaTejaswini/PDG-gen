import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //N回じゃんけん
        int K = sc.nextInt(); //K回前と同じ手を出せない
        int R = sc.nextInt(); //グーの得点
        int S = sc.nextInt(); //チョキの得点
        int P = sc.nextInt(); //パーの得点
        int sum = 0; //合計得点
        String T = sc.next(); //相手の出し手
        String[] enemy = T.split(""); //相手の出し手配列
        String[] me = new String[N]; //自分の出し手配列
        
        for(int i = 0; i < N; i++) {
            //K+1回目以降
            if(i >= K+1) {
                if(enemy[i].equals("r")) {
                    if(me[i-K].equals("p")) {
                        continue;
                    }else {
                        me[i] = "p";
                    sum += P;
                    }
                }else if(enemy[i].equals("s")) {
                    if(me[i-K].equals("r")) {
                        continue;
                    }else {
                        me[i] = "r";
                    sum += R;
                    }
                }else if(enemy[i].equals("p")) {
                    if(me[i-K].equals("s")) {
                        continue;
                    }else {
                        me[i] = "s";
                    sum += S;
                    }
                }
            //1~K回目
            }else {
                if(enemy[i].equals("r")) {
                    me[i] = "p";
                    sum += P;
                }else if(enemy[i].equals("s")) {
                    me[i] = "r";
                    sum += R;
                }else if(enemy[i].equals("p")) {
                    me[i] = "s";
                    sum += S;
                }
            }
        }
        System.out.println(sum);
        
    }
}