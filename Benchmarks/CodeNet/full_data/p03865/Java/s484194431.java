import java.util.Arrays;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = new StringBuilder(sc.next());
        int [] index= new int[26] ;
        int ptr = 0 ;
        index[S.charAt(0)-'a'] = ptr +1 ;
        ptr ++ ;

        if (solve3(S, index, ptr) == 1) {
            System.out.printf("First\n");
        } else {
            System.out.printf("Second\n");
        }
    }

    static int solve3(StringBuilder s, int[] index, int ptr) {
//        System.out.printf("s=%s, ptr=%d\n", s, ptr) ;
        if (s.length()<3) return 0 ;
        int i ;  // local index
        // 同じ文字が出現するまでスキャン
        for (i= ptr; i< s.length(); i++){
            if (index[s.charAt(i)-'a']==0) {
                index[s.charAt(i)-'a'] =i + 1;
            } else break; 
        }
        // 最終文字までスキャンした ⇒ 終了条件　abc....z
        if (i == s.length()) {
                return s.length() % 2 ;
        }
        // 最終文字でbreakした ⇒ 終了条件　abc....a が成立か?
        if (i == s.length()-1) {
            if (s.charAt(i)==s.charAt(0)) {
                return (s.length()-1) % 2 ;
            }
        }
        // 途中で、過去に出現した文字に出くわした　abc...(a)... または　a..b...(b)...
        if (s.charAt(i)==s.charAt(0)) {  //  abc...(a)....
            {
            // (a)を取った場合
            StringBuilder new_s = new StringBuilder(s) ;
            new_s.deleteCharAt(i) ;
            int[] new_index = Arrays.copyOf(index, 26) ;
            if (solve3(new_s, new_index, i) % 2 == 0) // returnが偶数 => 自分の手を含めて奇数
                return 1 ; // 勝ちを返す
            }
            {
            // (a)を取ると負ける場合は、(a)を残して左右に分割
            int left = (i) % 2 ;
            int right ;
            StringBuilder right_s = new StringBuilder(s.substring(i, s.length())) ;
            int new_ptr = 0 ;
            int[] new_index = new int[26] ;
            new_index[right_s.charAt(0)-'a'] = new_ptr +1 ;
            new_ptr ++ ;
            right= solve3(right_s, new_index, new_ptr) ;
            return (left+right) % 2 ;  // 奇数+奇数 または 偶数+偶数は負け。奇数+偶数は勝ち。
            }            
        } else {  //  a...b....(b)....
            {
            //  bを取った場合
            int left = (i-1) % 2 ;
            int right ;
            StringBuilder right_s = new StringBuilder(s.substring(i, s.length())) ;
            int new_ptr = 0 ;
            int[] new_index = new int[26] ;
            new_index[right_s.charAt(0)-'a'] = new_ptr +1 ;
            new_ptr ++ ;
            right= solve3(right_s, new_index, new_ptr) ;
            return (left+right) % 2 ;  // 奇数+奇数 または 偶数+偶数は負け。奇数+偶数は勝ち。
            }
        }
            
    }
}
