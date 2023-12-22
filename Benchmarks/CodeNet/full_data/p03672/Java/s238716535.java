import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int res = 0;
        for (int i = s.length()-1; i > 0; i--) {
            if (i == s.length()-1) continue;
            String tmpString = s.substring(0, i+1);

            if (tmpString.length() % 2 != 0) continue;// 偶文字列は文字数が偶数になるため奇数はスキップ

            String frontString = tmpString.substring(0, tmpString.length()/2);
            String rearString = tmpString.substring(tmpString.length()/2);

            if (frontString.equals(rearString)) {
                res = tmpString.length();
                break;
            }
        }

        System.out.println(res);
    }
}
