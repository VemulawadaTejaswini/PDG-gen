import java.util.*;

public class Main {
    static String s;
    static String t;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        t = sc.next();
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();


        boolean isMatch = false;
        int point = 0;
        //部分文字列を代入できる場所を探す
        for (int i = cs.length - ct.length; i >= 0 ; i--) {
            isMatch = false;
            for (int j = 0; j < ct.length; j++) {
                if (cs[i + j] != ct[j] && cs[i + j] != '?') {
                    isMatch = false;
                    break;
                } else {
                    isMatch = true;
                    point = i;
                }
            }
            if (isMatch) break;
        }
        if (!isMatch) {
            System.out.println("UNRESTORABLE ");
        } else {
            //部分文字列を代入
            for (int i = 0; i < ct.length; i++) {
                cs[point + i] = ct[i];
            }
            //先頭から順に出力 ?はaに変換する
            for (int i = 0; i < cs.length; i++) {
                if (cs[i] == '?') {
                    System.out.print('a');
                } else {
                    System.out.print(cs[i]);
                }
            }
            System.out.println();
        }
    }
}
