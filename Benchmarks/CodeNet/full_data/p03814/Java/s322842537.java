import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] str = s.split("");
        int count = 0;
        int countStart = 0;
        int countEnd = 0;
        
        //文字列を一文字ずつ取り出し、条件に合えばカウント
        //条件に合わないときは何もしない
        for (int i = 0; i < str.length; ++i){
            if (str[i].equals("A")){    //始まり
                countStart = 1;
            }
            if (countStart == 1){  //部分文字列のカウント
                ++count;
                if (str[i].equals("Z")){  //終わり
                    countEnd = count;
                }
            }
        }
        
        //出力
        System.out.println(countEnd);
        
    }
}