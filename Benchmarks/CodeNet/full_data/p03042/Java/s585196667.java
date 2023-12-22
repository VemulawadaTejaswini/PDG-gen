import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 文字列の入力
        String s = sc.next();
        int fn = Integer.parseInt(s.substring(0, 2));
        int sn = Integer.parseInt(s.substring(2, 4));
        String answer;

        if(fn >= 1 && fn <= 12 && sn >= 1 && sn <= 12){
            answer = "AMBIGUOUS";
        }else if(fn >= 1 && fn <= 12 && !(sn >= 1 && sn <= 12)){
            answer = "MMYY";
        }else if(!(fn >= 1 && fn <= 12) && sn >= 1 && sn <= 12){
            answer = "YYMM";
        }else{
            answer = "NA";
        }

        // 出力
        System.out.println(answer);

    }

}