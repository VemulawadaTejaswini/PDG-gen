import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int K = sc.nextInt();

        //先頭の文字格納
        char fstStr = S.charAt(0);
        //末尾の文字格納
        char endStr = S.charAt(S.length()-1);

        //最後の文字が変わらない時true
        Boolean endFlag = true;

        //全て同じ文字の時True
        Boolean sameFlag = true;

        long count = 0;
        long result = 0;

        //比較
        for(int i=1;i<S.length();i++) {
            //もし直前の文字と同じなら
            if(S.charAt(i) == S.charAt(i-1)){       
                count++;
                //もし最後の文字が変更されたら
                if(i == S.length()-1){
                    endFlag = false;
                }
                //一つ飛ばし
                i++;
            }
        }

        //先頭から同じ文字が何文字続くか
        int strNum = 1;
        //文字列の中身の検査用
        for(int i=1; i<S.length();i++) {
            if(S.charAt(i) == S.charAt(i-1)){
                strNum++;
            } else {
                sameFlag = false; //全ておなじ文字列でない場合
                //同じでなくなった場合ループを抜ける
                break;
            }
        }

        //もし末尾が変更されず、かつ先頭と末尾文字が等しい場合
        if(endFlag == true && fstStr == endStr){
            //(1)Sが奇数かつ、全て同じ文字の場合
            if(S.length() % 2 != 0 && sameFlag == true){
                result = (count * K) + (K / 2);
            }
            //(2)先頭からの文字が同じ文字で偶数個の場合
            if(strNum % 2 == 0){
                result = count * K;
            } else {
                result = (count+1) * K -1;
            }//(3)先頭からの文字が同じ文字で奇数個の場合
            
        } else result = count * K;
        System.out.println(result);
    }
}