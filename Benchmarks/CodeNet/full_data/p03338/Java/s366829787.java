import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int count = 0;
        
        //文字列の分割
        String[] str = S.split(" ",2);
        
        String X = str[0];
        String Y = str[1];
        
        //比較
        for(int i = 0; i < N; ++i) {
            
            for (int j = 0; j < X.length(); ++j){
                if (X.charAt(i) == Y.charAt(j)){
                    ++count;
                }
            }
        }
        
        System.out.println(count);
        
    }
}