import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

/**
 * http://arc060.contest.atcoder.jp/tasks/arc060_c
 * 
 * @author Cummin
 */
public class Main {
        static int N ;  // 2 <= N <= 10^5
        static long L ; // 1 <= L <= 10^9
        static int Q ;  // 2 <= Q <= 10^5
        static int X[] ;// 1 <= X <= 10^9, X[0..N-1]
        static int DP[] ; // 次に行ける最も遠いホテルを記録する
        
        public static void main(String[] args) {
//        System.out.printf("At Coder ARC060 問題E \n") ;
long start = System.currentTimeMillis();         
        X = fast_read(1) ;
        N = X[0] ;
        X = fast_read(N) ;
        int Y[] ;
        Y = fast_read(2) ;
        L = Y[0] ;
        Q = Y[1] ;
        int Qs[][] = new int[Q][2] ; // Qs[][from] < Qs[][to]
        for (int i=0 ; i<Q ; i++) {
            int from, to ;
            Y = fast_read(2) ;
            from = Y[0] ;
            to   = Y[1] ;
            if (from>to) {
                int t ;
                t = from; from = to ; to = t ;
            }
            Qs[i][0] = from - 1 ;
            Qs[i][1] = to - 1 ;
        }
long end = System.currentTimeMillis();
//System.out.println((end - start)  + "ms");

        DP = new int[N] ;

        ////// 出力も高速に ////////////////
        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < Q; i++) {
            //out.println(Solve2(Qs[i][0], Qs[i][1]));
            out.println(Solve3(Qs[i][0], Qs[i][1]));
        }
        out.flush();
        //////////////////////////////
    }

    static int Solve2(int from, int to) {
        int cnt = 1 ;
        int ptr = from+1 ;
        while (ptr<=to) {
            if ((X[ptr]-X[from])<=L) {
                ptr++ ;
            } else {
                from = ptr -1 ;
                cnt ++ ;
            }
        }
        return cnt ;
    }
    
    static int Solve3(int from, int to) {
        if (from>=to) return 0 ;
        if (DP[from]!=0) {
            return Solve3(DP[from],to) +1 ;
        } else {
            int ptr = from+1 ;
            while (ptr<=to) {
                if ((X[ptr]-X[from])<=L) {
                    ptr++ ;
                } else break ;
            }
            DP[from] = ptr - 1 ;
            return Solve3(ptr - 1, to) + 1;
        }
        
    }
    

    //////////////// 高速読み込み //////////////////////
    
    static int[] fast_read(int N) {
        int elements[] = new int[N];
        int e_cnt = 0;
        char c;
        while (e_cnt < N) {
            c = get_char() ;
            if ((c < '0') || ('9' < c)) {
                continue; // Skip 非数値文字
            }
            elements[e_cnt] = 0;
            while (('0' <= c) && (c <= '9')) {  // 数値文字を変換する
                elements[e_cnt] = elements[e_cnt] * 10 + (int) c - '0';
                c = get_char() ;
            }
//            System.out.printf("\nelement[%d] = %d \n", e_cnt + 1, elements[e_cnt]);
            e_cnt++;
        }
        return elements;
    }
    
    ///////////////// get_char() /////////////////////////////////
    //static char c_buf[] = new char[1024*1024];
    static byte c_buf[] = new byte[1024*1024];
    static int ptr = 0 ;
    static int c_len = 0 ;
    //static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static InputStream ins = System.in;

    static char get_char() {
        char ret;

        if (ptr >= c_len) {
            try {
                //c_len = br.read(c_buf);
                c_len = ins.read(c_buf);
            } catch (IOException ex) {
               ex.printStackTrace();
               System.exit(-1); // 終了する
            }
            ptr = 0;
        }
        ret = (char) c_buf[ptr];
        ptr++;
        return ret;
    }
}
