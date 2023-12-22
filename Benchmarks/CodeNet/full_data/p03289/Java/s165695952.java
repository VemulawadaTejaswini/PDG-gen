import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
    }
    
    Scanner sc;
    String S;
    String answer = null;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        S = sc.next();
    }
    
    //解答処理
    String solve() {
        int countC = 0;
        int countUp = 0;
        if (S.charAt(0) == 'A' && !Character.isUpperCase(S.charAt(1))){  //先頭にAがあり、かつ2文字目が大文字でないか
            
            for (int i=2; i<S.length()-1; ++i){ //探索範囲は3文字目以降、末尾から2文字目まで
                if(S.charAt(i) == 'C'){ //Cが含まれていればカウント
                    ++countC;
                }
                if(Character.isUpperCase(S.charAt(i))){ //大文字があればカウント
                    ++countUp;
                }
                if(countC > 1 || countUp >1){  //Cか大文字の存在があればループ終了
                    break;
                }
            }
        }
        
        if(countC == 1 && !Character.isUpperCase(S.charAt(S.length()-1))){ //文字列の条件を満たす場所にCが1つだけあり、かつ大文字が先頭のA以外にない場合
            answer = "AC";
        }else{
            answer = "WA";
        }
        
        return answer;
    }
    
    //出力
    void show(String answer) {
        System.out.println(answer);
    }
}