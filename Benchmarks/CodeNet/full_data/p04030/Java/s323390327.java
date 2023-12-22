import java.util.*;
import java.math.BigDecimal;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    //scanner
        String str = sc.next();     // 入力文字列
        // 入力操作
        String ans = "";            // 出力文字列
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='0'){         // 0が入力されたら
                ans += "0";                 // 末尾に0を足す
            }
            else if(str.charAt(i)=='1'){    // 1が入力されたら
                ans += "1";                 // 末尾に1を足す
            }
            // Bが入力されたら右から一文字削除する
            else if(ans.length()==1){       // 残り一文字の時
                ans = "";
            }
            else if(ans.length() > 1){      // 2文字以上ある時
                ans = ans.substring(0,ans.length()-1);  // 出力文字列の最後の文字を削る
            }
        }
        System.out.println(ans);    // output
    }
}
