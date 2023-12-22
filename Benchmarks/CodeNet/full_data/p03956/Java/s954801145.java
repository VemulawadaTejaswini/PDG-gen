import java.io.IOException;
import java.io.InputStream;

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
        int to_link_list ;
        int link_size ;
        Node() {
            this.upstream = 1 ;
            this.to_link_list = -1 ;
        }
    }
    static int link[][]  ;
    static int link_p ;
    
    static int stack[]  ;
    static int stack_p ;
    
    static int black_cnt ;

    public static void main(String[] args) {
        int IN[] ;
        IN = fast_read(2) ;
        N = IN[0] ;
        M = IN[1] ;
        index = new Node[N] ;
        link = new int[2][200000] ; // link[0][*]は、リンク先のノード番号。link[1][*]は次のリンクへのポインタ。(-1は終端)
        stack = new int[200000] ;
        black_cnt = 0 ;
        for (int i=0 ; i<M; i++) {
            int x, y ;
            IN = fast_read(2) ;
            x = IN[0] -1 ;
            y = IN[1] -1 ;
            create(x, y) ;
        }
//        dump_tree() ;
        solve() ;
        System.out.println(black_cnt);
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
        //add(x, y) ;
        add_link(index[x] , y) ;
        index[y].upstream = 0 ;
        black_cnt ++ ;
    }
    static void add_link(Node n, int lnk) {
//        System.out.printf("add_link (%d)\n", lnk+1) ;
        if (n.to_link_list==-1) {
            n.to_link_list = link_p ;
            link[0][link_p] = lnk ;
            link[1][link_p] = -1 ;
            link_p ++ ;
            n.link_size ++ ;
            return ;
        }
        int ptr ;
        ptr = n.to_link_list ;
        while (link[1][ptr]!=-1) {
            ptr = link[1][ptr] ;
        }
        link[1][ptr] = link_p ;
        link[0][link_p] = lnk ;
        link[1][link_p] = -1 ;
        link_p ++ ;
        n.link_size ++ ;
        return ;
    }
    static int get_link(Node n, int i) {
        int ptr  ;
        ptr = n.to_link_list ;
        for (int j=0 ; j < i; j++) {
            ptr = link[1][ptr] ;
            if (ptr == -1) System.out.printf("ERROR: get_link \n") ;
        }
        return link[0][ptr] ;
    }
    static boolean has_link(Node n, int i) {
        int ptr ;
        ptr = n.to_link_list ;
        for (int j=0; j < n.link_size ;j++) {
            if (i==link[0][ptr]) return true ;
            ptr = link[1][ptr] ;
        }
        return false ;
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
//        System.out.println("************") ;
        // Treeの形がループの場合
        for (int i=0 ; i< N ; i++) {
            if (index[i] == null) continue ;
            if (index[i].visit == 1) { continue ;}
            else {
                index[i].visit = 1 ;
                solve2(i) ;
            }
        }
    }
    static void solve2(int x) {  // 再帰　⇒　ループ
        int xy_links = 0;
        while (true) {
            if (xy_links < index[x].link_size) {    // xy_links, 途中で追加あり
                /////////////////////////////////////
                //// すべてのxy_linkの先のノードのyについて
                ////   yz_linkの先のzノードで、(z,x)があるか/無ければ追加する
                int y = get_link(index[x], xy_links);  //  y= 1つ先のノード#
                int z  ;
                for (int yz_links = 0; yz_links < index[y].link_size; yz_links++) {
                    z = get_link(index[y], yz_links); //  z= 2つ先のノード#  
            //        System.out.printf("\nSolve2 x:%d -> y:%d -> z:%d ", x + 1, y + 1, z + 1);
                    //check_and_set(z, x);      
                    if (has_link(index[z], x)) {
                        continue;
                    } else {
                        //add(x,y) ;
                        add_link(index[z], x);
                        index[x].upstream = 0;
                        black_cnt++;
                    }
                }
                ///////////////////////////
                // 先に探索を進めないケース
                if (index[y].visit==1) {
                    xy_links ++ ;
                    continue ;
                }
                if (x == y) {
                    xy_links ++ ;
                    continue ;                    
                }
                int flag = 0 ;
                for (int i = stack_p-2 ; 0<=i; i=i-2 ){
                    if (y == stack[i]) { // ループになる
                        xy_links ++ ;
                        flag = 1 ;
                        break ;
                    }
                }
                if (flag==1) continue ;
                // other default case
                // 自己ループでない場合のみ、先を探索
                        stack[stack_p] = x ;
                        stack_p ++ ;
                        stack[stack_p] = xy_links ;
                        stack_p ++ ;
            //            System.out.printf("Push: x:%d, xy_links:%d \n", x + 1, xy_links + 1);
            /*/            for (int i = stack_p-1 ; 0<=i; i=i-2 ){
                                System.out.printf(" x-base:%d - xy_links:%d, ", stack[i-1]+1, stack[i]+1) ;
                            }
                            System.out.println() ;  
                            /**/
                        x = y;
                        xy_links = 0;
                ///////////////////////////
            } else {
                index[x].visit = 1;   // xノード起点でyノードの先の(z,x)をすべて調べたので、済フラグ
                if (stack_p == 0) {
                    return;
                }
                stack_p -- ;
                xy_links = stack[stack_p] ;
                stack_p -- ;
                x = stack[stack_p];
            //    System.out.printf("Pop:  x:%d, xy_links:%d \n", x + 1, xy_links + 1);
                xy_links++;  // 次のxy_linkへ
            }
        }
    }
    
    static void dump_mat() {
        for (int iy=0 ;iy<N ;iy++) {
            for (int ix=0 ;ix<N; ix++) {
                if (index[ix]== null) {
                    System.out.printf(".") ;
                } else if (has_link(index[ix], iy)) {
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
            int ptr = index[i].to_link_list ;
            for (int j=0 ; j< index[i].link_size ; j++) {
                int k = link[0][ptr] ;
                System.out.printf("--> %d ", k+1);
                ptr = link[1][ptr] ;
            }
            System.out.println();
        }
        System.out.println();
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
    static byte[] __c_buf = new byte[1024*1024];
    static int __ptr = 0 ;
    static int __c_len = 0 ;
    //static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static InputStream __ins = System.in;

    static char get_char() {
        char ret;

        if (__ptr >= __c_len) {
            try {
                //c_len = br.read(c_buf);
                __c_len = __ins.read(__c_buf);
            } catch (IOException ex) {
               ex.printStackTrace();
               System.exit(-1); // 終了する
            }
            __ptr = 0;
        }
        ret = (char) __c_buf[__ptr];
        __ptr++;
        return ret;
    }
}
