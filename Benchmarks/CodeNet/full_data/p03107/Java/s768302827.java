import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        
        int length = 0;
        while(S.contains("01") || S.contains("10")){

            String str = "";
            //01の切り出しとカウント
            String[] s = S.split("01");
            for(String bind : s){
                str += bind;
            };
            //10の切り出しとカウント
            s = str.split("10");
            str = "";
            for(String bind : s){
                str += bind;
            }
            S = str;
            length = str.length();
        }
        System.out.println(N - length);
    }
}
