import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *  http://agc006.contest.atcoder.jp/tasks/agc006_f
 * 
 * @author Cummin
 */
public class Main {
    static int N ; // N<10^5
    static int M ; // M<10^5
    static int pos[][] ;
    static NavigableMap<Long, Integer> mat = new TreeMap<>();  // 二次元を一次元にしたmap
    static Deque<Long> queue = new ArrayDeque<>() ; // チェックが必要な点(辺)のキュー
    static int black_cnt ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        pos = new int[2][N] ;
        for (int i=0 ; i<M; i++) {
            pos[0][i] = sc.nextInt()-1 ;  // x
            pos[1][i] = sc.nextInt()-1 ;  // y
            mat.put(((long)pos[0][i]<<32) + pos[1][i], 0) ;
            queue.add(((long)pos[0][i]<<32) + pos[1][i]) ;
        }
        black_cnt = M ;
        solve() ;
        System.out.println(black_cnt);
//        dump_mat() ;
    }

    static void solve() {
        Long p ;
        while((p=queue.poll())!=null) {
            check_and_set(p) ;
        }
    }
    
    static void check_and_set(long a) {
        long x , y ;
        x = a >> 32 ;
        y = a & 0x00FFFFFFF ;
//        System.out.printf("C&S: x:%d y:%d\n", x+1,y+1) ;
        long y0 = y << 32 ;  // y,0
        long y_ = mat.ceilingEntry(y0).getKey() ; // y,*
        while (y == (y_ >>32)) {
            long z = y_ & 0x00FFFFFFF ;
            long zx = (z<<32) + x ;   // z,x
            if (mat.ceilingEntry(zx)==null) { // Keyが存在しない(zxが既存よりも大きいkey)
                mat.put(zx, 0) ;
                black_cnt++ ;
                queue.add(zx) ;                
            } else if ((mat.ceilingEntry(zx).getKey())!=zx) { // Keyが存在しない
                mat.put(zx, 0) ;
                black_cnt++ ;
                queue.add(zx) ;
            }
            if ((mat.ceilingEntry(y_+1))==null) break ;
            y_ = mat.ceilingEntry(y_+1).getKey() ; // move to next
        }
        mat.put(a, 1) ; // Mark as finished
    }
    static void dump_mat() {
        for (int iy=0 ;iy<N ;iy++) {
            for (int ix=0 ;ix<N; ix++) {
                if (mat.ceilingEntry(((long)ix<<32) + iy)== null) {
                    System.out.printf(".") ;
                } else if (mat.ceilingEntry(((long)ix<<32) + iy).getKey() == (((long)ix<<32) + iy)) {
                    System.out.printf("*") ;
                } else System.out.printf(".") ;
            }
            System.out.println() ;
        }
    }
}
