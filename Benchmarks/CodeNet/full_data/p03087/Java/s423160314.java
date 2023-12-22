import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();

        Pattern p = Pattern.compile("AC");
        for (int i=0; i<Q; i++) {
            int li = sc.nextInt() -1;
            int ri = sc.nextInt() ;

            String wk = S.substring(li, ri);
            //System.out.println(wk);
            Matcher m = p.matcher(wk);

            int cnt = 0;
            while (m.find()) cnt++;
            System.out.println(cnt);
        }
    }

}