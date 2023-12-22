import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        long k = sc.nextLong();

        // 処理
        long out = 0;
        long tmp = 0;
        for(int i = 1; i <= k; i++){
            tmp = out + 1;
            while(!isLunlun(tmp)) {
                tmp++;
            }
            out = tmp;
        }

        // 出力
        System.out.println(out);
    }

    public static boolean isLunlun(long x){
        String s = Long.toString(x);
        int l = s.length();
        if (l == 1) return true;
        boolean res = true;
        for(int i = 0; i < l - 1; i++){
            int c = s.charAt(i+1) - s.charAt(i);
            if(c != 0 && c != 1 && c != -1) {
                res = false;
                break;
            }
        }
        return res;
    }
}