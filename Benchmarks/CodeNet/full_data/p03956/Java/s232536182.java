import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *  http://agc006.contest.atcoder.jp/tasks/agc006_f
 * 
 * @author Cummin
 */
public class Main {
    static int N ;
    static int M ;
    static int pos[][] ;
    static Map<Long, Integer> mat ;      // 二次元を一次元にしたmap
    static Map<Integer, List> Y_index = new TreeMap<>();  // <Key=y, Value=x>とした、逆引き辞書(yは重複がある)
    static int black_cnt ;
    static Deque<Pos> queue = new ArrayDeque<>() ; // チェックが必要なPosのキュー
    static class Pos {
        int x ;
        int y ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        pos = new int[2][N] ;
        mat = new HashMap<>(N*2) ;
        for (int i=0 ; i<M; i++) {
            pos[0][i] = sc.nextInt()-1 ;  // x, y
            pos[1][i] = sc.nextInt()-1 ;
            Pos p = new Pos() ;  // 毎回 newをする必要がある
            p.x= pos[0][i] ;
            p.y= pos[1][i] ;
            set_bit(p) ;
            add_y_index(p) ;
            queue.offerLast(p);
        }
        //
        black_cnt = M ;
        solve() ;
        System.out.println(black_cnt);
        //dump_mat() ;
    }
    static void add_y_index(Pos p) {
        List list ;
//        System.out.printf("Add_index to Y_index: (x:%d, y:%d)  list= ", p.x+1, p.y+1) ;
        if (Y_index.get(p.y)==null) {
            list = new ArrayList() ;
            list.add(p.x) ;
            Y_index.put(p.y, list) ;            
        } else {
            list = Y_index.get(p.y) ;
            list.add(p.x) ;
        }
    }

    static void solve() {
        Pos p ;
        while(true) {
            p=queue.pollLast() ;
            if (p==null) break ;
            check_and_set(p) ;
        }
    }
    
    static void check_and_set(Pos p_xy) {
        int x = p_xy.x ;
        int y = p_xy.y ;
        Pos p_yz = new Pos() ; // (y,z)
        Pos p_zx = new Pos() ; // (z,x)
        for (int z = 0; z < N; z++) {
            p_yz.x = y ;
            p_yz.y = z ; 
            if (get_bit(p_yz) == 1) {
                p_zx.x = z ;
                p_zx.y = x ;
                if (get_bit(p_zx) == 0) {
                    set_bit(p_zx);
                    black_cnt++;
                    queue.add(p_zx) ; // 新たに埋めた点を追加
                    add_line(p_yz) ;  // p=(y,z) z => Y となる (X*,Y)をすべてqueueに追加する
                    add_y_index(p_zx) ;
                }
            }
        }
    }
    static void add_line(Pos p) {
        List list = Y_index.get(p.y) ;
        if (list == null) return ;
        Pos pp = new Pos() ;
        for (Object i: list) {
            pp.x = (int) i ;
            pp.y = p.y ;
            queue.add(pp) ;
//            System.out.printf("      Add to queue: (x:%d, y:%d)\n", pp.x+1, pp.y+1) ;
        }
    }
    
    static void set_bit(Pos p) {
        Long index = ((long)p.x<<32) + p.y ;
        if (mat.get(index)==null) {
            mat.put(index,1) ;
        }
    }
    static int get_bit(Pos p) {
        Long index = ((long)p.x<<32) + p.y ;
        if (mat.containsKey(index)) {
            return 1 ;
        } else {
            return 0 ;
        }
    }
    static void dump_mat() {
        Pos pp = new Pos() ;
        for (int iy=0 ;iy<N ;iy++) {
            pp.y = iy ;
            for (int ix=0 ;ix<N; ix++) {
                pp.x = ix ;
                if (get_bit(pp)==0) System.out.printf(".") ;
                else System.out.printf("*") ;
            }
            System.out.println() ;
        }
    }
}
