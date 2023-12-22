import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = scan.next();
        String t = scan.next();
        char[] s_d = s.toCharArray();
        int[] s_hist = new int[26];
        for(char x : s_d) {
            s_hist[x - 'a'] += 1;
        }
        char[] t_d = t.toCharArray();
        int[] t_hist = new int[26];
        for(char x : t_d) {
            t_hist[x - 'a'] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (0 < t_hist[i] && s_hist[i] == 0) {
                System.out.println(-1);
                return;
            }
        }
        int current = 0;
        BigInteger turn = BigInteger.ZERO;
        BigInteger remain = BigInteger.ZERO;
        while(current < t_d.length) {
            turn = turn.add(BigInteger.ONE);
            for (int i = 0; i < s_d.length; i++) {
                if (s_d[i] == t_d[current]) {
                    current += 1;
                    if (current == t_d.length) {
                        remain = new BigInteger(Integer.toString(i));
                        break;
                    }
                }
            }
        }
        BigInteger answer = turn.subtract(BigInteger.ONE);
        answer = answer.multiply(new BigInteger(Long.toString(s_d.length)));
        answer = answer.add(remain).add(BigInteger.ONE);
        System.out.println(answer.toString());
    }
}
