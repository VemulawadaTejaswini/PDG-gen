import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
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
    static Node[] index ; 
    
    static class Node {
        int visit ;
        int upstream ;  // starting point 
        List<Integer> next ;
        Node() {
            next = new ArrayList<>() ;
            this.upstream = 1 ;
        }
    }
    static Deque<Integer> stack = new LinkedList<>() ;
    static int black_cnt ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        index = new Node[N] ;
        black_cnt = 0 ;
        for (int i=0 ; i<M; i++) {
            int x, y ;
            x = sc.nextInt()-1 ;  // x
            y = sc.nextInt()-1 ;  // y
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
        if (index[y]==null) {
            index[y]= new Node() ;
        }
        add(x, y) ;
    }
    static void add(int x, int y) {
//        System.out.printf("add x:%d, y:%d  ", x+1, y+1) ;
        Node n ;
        n = index[x] ;
        n.next.add(y) ;
        index[y].upstream = 0 ;
        black_cnt ++ ;
    }

    static void solve() {
        //  Treeの端点からスタート
        for (int i=0 ; i<N ; i++){
            if (index[i] ==null)continue ;
            if (index[i].upstream==1 ) {
                index[i].visit = 1 ;
                solve2(i) ;
            }
        }
//        System.out.printf("*********************\n") ;
        // Treeの形がループの場合
        for (int i=0 ; i< N ; i++) {
            if (index[i] == null) continue ;
            if (index[i].visit == 0) {
//                System.out.printf("\nSolve: %d", i+1) ;
                index[i].visit = 1 ;
                solve2(i) ;
            }
        }
    }
    static void solve2(int x) {  // 再帰　⇒　ループ
        int xy_links = 0;
        while (true) {
            if (xy_links < index[x].next.size()) {    // xy_links, 途中で追加あり
                /////////////////////////////////////
                //// すべてのxy_linkの先のノードのyについて
                ////   yz_linkの先のzノードで、(z,x)があるか/無ければ追加する
                int y = index[x].next.get(xy_links);  //  y= 1つ先のノード#
                for (int yz_links = 0; yz_links < index[y].next.size(); yz_links++) { 
                    int z = index[y].next.get(yz_links); //  z= 2つ先のノード#
//                    System.out.printf("\nSolve2 x:%d -> y:%d -> z:%d ", x + 1, y + 1, z + 1);
                    check_and_set(z, x);      
                }
                ///////////////////////////
                if (index[y].visit == 0) {
                    if (x != y) { // 自己ループでない場合のみ、先を探索
                        stack.offerFirst(x);
                        stack.offerFirst(xy_links);
//                        System.out.printf("Push: x:%d, xy_links:%d \n", x + 1, xy_links + 1);
                        x = y;
                        xy_links = 0;
                    } else {
                        xy_links++;
                    }
                } else {
                    // 次のxy_linkへ    
                    xy_links++;
                }
            } else {
                index[x].visit = 1;   // xノード起点でyノードの先の(z,x)をすべて調べたので、済フラグ
                if (stack.peekFirst() == null) {
                    return;
                }
                xy_links = stack.pollFirst();
                x = stack.pollFirst();
//                System.out.printf("Pop:  x:%d, xy_links:%d \n", x + 1, xy_links + 1);
                xy_links++;  // 次のxy_linkへ
            }
        }
    }

    static void check_and_set(int x, int y) {
/*
        if (index[x] == null) {
//            System.out.printf(" CREATE node[%d] ", x+1) ;
            create(x, y) ;
            return ;
        }
        */
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
/*
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
*/