import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        
        for (int i = 0; i < S.length(); ++i){
            if (S.equals(T)){   //一致していればそこで終了
                System.out.println("Yes");
                return;
            }
            S = S.substring(S.length()-1, S.length()) + S.substring(0, S.length()-1);
        }

        System.out.println("No");

    }
}
