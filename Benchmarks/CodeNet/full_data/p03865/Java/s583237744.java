import java.util.Arrays;
import java.util.Scanner;

/**
 * ARC064_D
 * 
 * http://arc064.contest.atcoder.jp/tasks/arc064_b
 * 
 * @author Cummin
 */
public class Main {

    static StringBuilder S ;   
    static int[] DP ;
    static int total_len ;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = new StringBuilder(sc.next());
        total_len = S.length() ;
        DP = new int[S.length()] ; // 初期値=0, 奇数=1, 偶数=2
        
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
                return s.length()-2 % 2 ;
        }
        // 途中で、過去に出現した文字に出くわした　abc...(a)... または　a..b...(b)...
        if (s.charAt(i)==s.charAt(0)) {  //  abc...(a)....
            // (a)を取らない場合、(a)を残して左右に分割
            int left = (i-2) % 2 ; // i= length([i]-[0])-1
            int right ;
            if ( (s.length()-i) < 3) {
                if (left == 1) return left ; // 勝ちの場合
            }
            if (DP[total_len - (s.length()-i)]!=0) {
//        System.out.printf("DP_use: %d, OE=%d \n", total_len - (s.length()-i),DP[total_len - (s.length()-i)]) ;
                return (DP[total_len - (s.length()-i)] + left) % 2 ;
            }
            StringBuilder right_s = new StringBuilder(s.substring(i, s.length())) ;
            int new_ptr = 0 ;
            int[] new_index = new int[26] ;
            new_index[right_s.charAt(0)-'a'] = new_ptr +1 ;
            new_ptr ++ ;
            right= solve3(right_s, new_index, new_ptr) ;
            DP[total_len - right_s.length()] = 2 - right ;
//        System.out.printf("DP_reg: %d\n", total_len - right_s.length()) ;
            if ((left+right) % 2 == 1) {
                return (left+right) % 2 ;
            }  // 奇数+奇数 または 偶数+偶数は負け。奇数+偶数は勝ち。
                        
        } else {  //  a...b....(b)....
            {
            //  (b)を取らない場合は、(b)を残して左右に分割
                // bを先に取るパターン
                int left =i-1 % 2 ;  
                // bを取らないパターン
                if (left == 0 ){
                int left_left = (index[s.charAt(i)-'a']-1) % 2 ;
                int left_right = (i - index[s.charAt(i) - 'a']) % 2 ;
                left = (left_left + left_right) % 2 ; 
                }
            int right ;
            if ( (s.length()-i) < 3) {
                if (left == 1) return left ; // 勝ちの場合
            }
            if (DP[total_len - (s.length()-i)]!=0) {
//        System.out.printf("DP_use: %d, OE=%d \n", total_len - (s.length()-i),DP[total_len - (s.length()-i)]) ;
                return (DP[total_len - (s.length()-i)] + left) % 2 ;
            }
            StringBuilder right_s = new StringBuilder(s.substring(i, s.length())) ;
            int new_ptr = 0 ;
            int[] new_index = new int[26] ;
            new_index[right_s.charAt(0)-'a'] = new_ptr +1 ;
            new_ptr ++ ;
            right= solve3(right_s, new_index, new_ptr) ;
            DP[total_len - right_s.length()] = 2 - right ;
//        System.out.printf("DP_reg: %d\n", total_len - right_s.length()) ;
            if ((left+right) % 2 == 1) {
                return (left+right) % 2 ;
            }  // 奇数+奇数 または 偶数+偶数は負け。奇数+偶数は勝ち。
}
        }
        // (a) または　(b)を取る場合
        if (i >= s.length() - 1) {
            return 0; // 負けを返す
        }
        if (s.charAt(i - 1) != s.charAt(i + 1)) {
            char del_c = del(s, i);
            int[] new_index = Arrays.copyOf(index, 26);
            if (solve3(s, new_index, i) % 2 == 0) {// returnが偶数 => 自分の手を含めて奇数
                ins(s, i, del_c);
                return 1; // 勝ちを返す
            } else {
                ins(s, i, del_c);
                return 0; // 負けを返す                    
            }
        } else {
            return 0 ; // 負けを返す
        }
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
