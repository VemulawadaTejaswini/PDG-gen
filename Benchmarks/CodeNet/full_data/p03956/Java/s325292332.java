import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *  http://agc006.contest.atcoder.jp/tasks/agc006_f
 * 
 * @author Cummin
 */
public class Main {
    static int N ; // N<10^5
    static int M ; // M<10^5
    static int pos[][] ;
    static Node[] index ; 
    
    static class Node {
        int done ;
        List<Integer> next ;
        Node() {
            next = new ArrayList<>() ;
        }
    }
    static Node root ;
    static int black_cnt ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        pos = new int[2][N] ;
        index = new Node[N] ;
        black_cnt = 0 ;
        for (int i=0 ; i<M; i++) {
            int x, y ;
            x = pos[0][i] = sc.nextInt()-1 ;  // x
            y = pos[1][i] = sc.nextInt()-1 ;  // y
            create(x, y) ;
        }
//        dump_tree() ;
        solve() ;
        System.out.println(black_cnt);
//        System.out.printf("\nANS=%d \n",black_cnt);
//        dump_tree() ;
//        dump_mat() ;
    }
    
    static void create(int x, int y) {
        if (index[x]==null) {
            index[x] = new Node() ;
        }
        add(x, y) ;
    }
    static void add(int x, int y) {
//        System.out.printf("add x:%d, y:%d  ", x+1, y+1) ;
        Node n ;
        n = index[x] ;
        n.next.add(y) ;
        black_cnt ++ ;
    }

    static void solve() {
        for (int i=0 ; i< N ; i++) {
            if (index[i] == null) continue ;
            if (index[i].done == 0) {
//                System.out.printf("\nSolve: %d", i+1) ;
                solve2(i) ;
                index[i].done = 1 ;
            }
        }
    }
    static void solve2(int n) {
        // for (Integer i: index[n].next) {　ではエラーになる
        // 拡張forを使うと　java.util.ConcurrentModificationExceptionのエラーが発生する
        // これは、https://teratail.com/questions/16901　にあるように、ArrayListに要素を追加すると
        // 内部で保持しているIteratorの「変更された回数」（サイズ）とミスマッチが発生する

        for (int ii = 0; ii < index[n].next.size() ; ii++) {
            int i = index[n].next.get(ii) ;

            if (index[i]== null) continue ;
            // for (Integer j: index[i].next) {  // 同上
            for (int jj = 0 ; jj < index[i].next.size(); jj++){
                int j = index[i].next.get(jj) ;
//        System.out.printf("\nSolve2 x:%d -> y:%d -> z:%d ", n+1, i+1,j+1) ;
                check_and_set(j,n) ;
            }
        }
    }
    static void check_and_set(int x, int y) {
        if (index[x] == null) {
//            System.out.printf(" CREATE node[%d] ", x+1) ;
            create(x, y) ;
            return ;
        }
        if (index[x].next.contains(y)) return ;
        add(x,y) ;
    }

    static void dump_mat() {
        for (int iy=0 ;iy<N ;iy++) {
            for (int ix=0 ;ix<N; ix++) {
                if (index[ix]== null) {
                    System.out.printf(".") ;
                } else if (index[ix].next.contains(iy)) {
                    System.out.printf("*") ;
                } else System.out.printf(".") ;
            }
            System.out.println() ;
        }
    }
    static void dump_tree() {
        System.out.println();
        for (int i = 0; i < N; i++) {
            if (index[i] == null) {
                continue;
            }
            System.out.printf("[%d]:", i+1);
            for (int j : index[i].next) {
                System.out.printf("--> %d ", j+1);
            }
            System.out.println();
        }
        System.out.println();
    }
}
