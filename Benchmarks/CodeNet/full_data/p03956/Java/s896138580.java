import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
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
    static TreeMap<Integer, TreeMap> mat ;      // 二次元のmap
    static TreeMap<Integer, List> Y_index = new TreeMap<>();  // <Key=y, Value=x>とした、逆引き辞書(yは重複がある)
    static int black_cnt ;
    static Queue<Pos> queue = new ArrayDeque<>() ; // チェックが必要なPosのキュー
    static class Pos {
        int x ;
        int y ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        pos = new int[2][N] ;
        mat = new TreeMap<>() ;
        for (int i=0 ; i<M; i++) {
            pos[0][i] = sc.nextInt()-1 ;  // x, y
            pos[1][i] = sc.nextInt()-1 ;
            set_bit(pos[0][i], pos[1][i]) ;
            add_index(pos[1][i], pos[0][i]) ;
            Pos p = new Pos() ;
            p.x= pos[0][i] ;
            p.y= pos[1][i] ;
            queue.add(p) ;
        }
        black_cnt = M ;
        solve() ;
        System.out.println(black_cnt);
        //dump_mat() ;
    }
    static void add_index(int x, int y) {
        List list ;
        if (Y_index.get(y)==null) {
            list = new ArrayList() ;
            list.add(x) ;
            Y_index.put(y, list) ;            
        } else {
            list = Y_index.get(y) ;
            list.add(x) ;
            Y_index.put(y, list) ;
        }
    }

    static void solve() {
        Pos p ;
        while((p=queue.poll())!=null) {
            check_and_set(p) ;
        }
    }
    
    static void check_and_set(Pos a) {
        int x = a.x ;
        int y = a.y ;
        for (int z = 0; z < N; z++) {
            if (get_bit(y, z) == 1) {
                if (get_bit(z, x) == 0) {
                    set_bit(z, x);
                    black_cnt++;
                    Pos p = new Pos() ;
                    p.x= z ;
                    p.y= x ;
                    queue.add(p) ; // 新たに埋めた点を追加
                    add_line(p.y) ;// Y=p.y となる (X*,Y)をすべてqueueに追加する
                    add_index(x,z) ;
                }
            }
        }
    }
    static void add_line(int y) {
        List list = Y_index.get(y) ;
        Pos p = new Pos() ;
        for (Object i: list) {
            p.y = (int) i ;
            p.x = y ;
            queue.add(p) ;
        }
    }
    
    static void set_bit(int x, int y) {
        TreeMap<Integer, Integer> n  ;
        if (mat.get(x)==null) {
            n = new TreeMap<>() ;
            n.put(y,1) ;
            mat.put(x, n) ;
        } else {
            n = mat.get(x) ;
            if (n==null) {
                n = new TreeMap<>() ;
            } 
            n.put(y,1) ;
            mat.put(x,n) ;
        }
    }
    static int get_bit(int x, int y) {
        TreeMap<Integer, Integer> n ;
        if (mat.get(x)==null) {
            return 0 ;
        } else {
            n = mat.get(x) ;
            if (n==null) {
                return 0 ;
            } 
            if (n.get(y)==null) return 0 ;
            else return n.get(y) ;
        }
    }
    static void dump_mat() {
        for (int iy=0 ;iy<N ;iy++) {
            for (int ix=0 ;ix<N; ix++) {
                if (get_bit(ix,iy)==0) System.out.printf(".") ;
                else System.out.printf("*") ;
            }
            System.out.println() ;
        }
    }
}
