import java.util.Scanner;
import java.util.TreeMap;

/**
 * ARC064_D
 * 
 * http://arc064.contest.atcoder.jp/tasks/arc064_b
 * 
 * @author Cummin
 */
public class Main {

    static StringBuilder S ;   
    static TreeMap<String, Integer> dp = new TreeMap<> () ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = new StringBuilder(sc.next());

        if (solve2(S, 1) == 0) {
            System.out.printf("First\n");
        } else {
            System.out.printf("Second\n");
        }
    }

    static int solve2(StringBuilder s, int player) {
        if (dp.containsKey(s.toString())) {
            if (dp.get(s.toString())== player) {
                return -1 ;
            } else {
                return 0 ;
            }
        }
        for (int i = 0; i < s.length() - 2; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            char c3 = s.charAt(i + 2);
            char del_c;
            if (c1 != c3) {
                del_c = del(s, i + 1);
                if (player == 1) {
                    player = 2;
                } else {
                    player = 1;
                }
                // 相手が負ける=自分が勝つ戦略が見つかったらReturn
                if (solve2(s, player) == -1) {
                    ins(s, i + 1, del_c);
                    return 0;
                }
                ins(s, i + 1, del_c);
            }
        }
        dp.put(s.toString(), player) ;  // sの局面で負けるplayerを登録
        return -1;  //lost
    }

    static char del(StringBuilder s, int j) {
        char ret = s.charAt(j) ;
        s.deleteCharAt(j) ;
        return ret;
    }

    static void ins(StringBuilder s, int j, char c) {
        s.insert(j, c) ;
    }
}
