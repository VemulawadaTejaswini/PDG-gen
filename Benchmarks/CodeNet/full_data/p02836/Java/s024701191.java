import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int len = s.length();
        String s1, s2;
        if (len % 2 == 0) {
            // 割り切れる
            s1 = s.substring(0, len / 2);
            s2 = s.substring(len / 2);
        } else {
            // 割り切れない
            s1 = s.substring(0, len / 2);
            s2 = s.substring(len / 2 + 1);
        }

        StringBuffer sb = new StringBuffer(s2);
        s2 = sb.reverse().toString();

        int cnt = 0;
        for (int i=0; i < len/2; i++) {
            if (!s1.substring(i, i+1).equals(s2.substring(i, i+1)))  {
                cnt++;
            }
        }

        System.out.println(cnt);


    }
}