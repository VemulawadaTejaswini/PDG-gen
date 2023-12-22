import java.io.InputStream;
import java.util.Scanner;

/**
 * Created on 2017/10/29.
 */
public class main {
    public static void Main(String args[]) {

        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray(); //?,t,c,?,?,?,?
        char[] t = sc.nextLine().toCharArray(); //c,o,d,e,r
        int SLength = s.length;
        int TLengt = t.length;
        outer:
        for (int i = SLength - TLengt; i <= 0; i--) {
            for (int j = 0; j < TLengt; j++) {
                if (s[i + j] != '?' && s[i + j] != t[j]) {
                    continue outer;
                } else {
                    s[i + j] = t[j];
                }
            }
            System.out.println("UNRESTORABLE");
            break;
        }
        for (int i = 0; i < SLength; i++) {
            if (s[i] == '?') {
                s[i] = 'a';
            }

        }
        System.out.println(s);

    }
}


