import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 *  http://agc006.contest.atcoder.jp/tasks/agc006_f
 * 
 * @author Cummin
 */
public class Main {
    static int N ; // N<10^5
    static int M ; // M<10^5
    static Node[] index ; 
    static Deque<Integer> queue = new ArrayDeque<>() ; // チェックが必要な点(辺)のキュー
    
    static int black_cnt ;

    public static void main(String[] args) {
        int IN[] ;
        IN = fast_read(2) ;
        N = IN[0] ;
        M = IN[1] ;
        index = new Node[N] ;
        // 双方向リンクに変更
        out_link = new int[2][200000] ; // link[0][*]は、リンク先(outbound)のノード番号。link[1][*]は次のリンクへのポインタ。(-1は終端)
        in_link = new int[2][200000] ; // link[0][*]は、リンク元(inbound)のノード番号。link[1][*]は次のリンクへのポインタ。(-1は終端)
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
    
    static class Node {
        int visit ;
        int inTheQ ;
        int to_out_link_list ;
        int out_link_size ;
        int to_in_link_list ;
        int in_link_size ;
        Node() {
            this.to_out_link_list = -1 ;
            this.to_in_link_list = -1 ;
        }
    }
    
    static int[][] out_link  ;
    static int out_link_p ;
    static int[][] in_link  ;
    static int in_link_p ;
    
    static void create(int x, int y) {
        if (index[x]==null) {
            index[x] = new Node() ;
        }
        if (index[y]==null) {
            index[y]= new Node() ;
        }
        //add(x, y) ;
//        System.out.printf("add_link (%d -> %d)\n", x+1, y+1) ;
        add_out_link(index[x] , y) ;
        add_in_link(x,index[y]) ;
        black_cnt ++ ;
    }
    static void add_in_link(int lnk, Node m) {
        if (m.to_in_link_list==-1) {
            m.to_in_link_list = in_link_p ;
            in_link[0][in_link_p] = lnk ;
            in_link[1][in_link_p] = -1 ;
            in_link_p ++ ;
            m.in_link_size ++ ;
            return ;
        }
        int ptr ;
        ptr = m.to_in_link_list ;
        while (in_link[1][ptr]!=-1) {
            ptr = in_link[1][ptr] ;
        }
        in_link[1][ptr] = in_link_p ;
        in_link[0][in_link_p] = lnk ;
        in_link[1][in_link_p] = -1 ;
        in_link_p ++ ;
        m.in_link_size ++ ;
        return ;
    }
    static void add_out_link(Node n, int lnk) {
        if (n.to_out_link_list==-1) {
            n.to_out_link_list = out_link_p ;
            out_link[0][out_link_p] = lnk ;
            out_link[1][out_link_p] = -1 ;
            out_link_p ++ ;
            n.out_link_size ++ ;
            return ;
        }
        int ptr ;
        ptr = n.to_out_link_list ;
        while (out_link[1][ptr]!=-1) {
            ptr = out_link[1][ptr] ;
        }
        out_link[1][ptr] = out_link_p ;
        out_link[0][out_link_p] = lnk ;
        out_link[1][out_link_p] = -1 ;
        out_link_p ++ ;
        n.out_link_size ++ ;
        return ;
    }
    static int get_link(Node n, int i) {
        int ptr  ;
        ptr = n.to_out_link_list ;
        for (int j=0 ; j < i; j++) {
            ptr = out_link[1][ptr] ;
            if (ptr == -1) System.out.printf("ERROR: get_link \n") ;
        }
        return out_link[0][ptr] ;
    }
    static boolean has_link(Node n, int i) {
        int ptr ;
        ptr = n.to_out_link_list ;
        for (int j=0; j < n.out_link_size ;j++) {
            if (i==out_link[0][ptr]) return true ;
            ptr = out_link[1][ptr] ;
        }
        return false ;
    }
    static void solve() {
        for (int i=0 ; i<N ; i++){
            if (index[i] ==null)continue ;
            else {
                if ((index[i].out_link_size>0)&&(index[i].in_link_size==0)) { // スタートのリーフ
                    queue.add(i) ;
                    index[i].inTheQ = 1 ;
//                    System.out.printf("Add to Queue: %d \n",i+1) ;
                }
            }
        }
        Integer p ;
        while((p=queue.poll())!=null) {
//            System.out.printf("Check node %d \n", p+1) ;
            index[p].inTheQ = 0 ;
            solve2(p) ;
        }
//        System.out.printf("black_cnt= %d \n", black_cnt) ;
        int last_bk ;
        last_bk=0 ;
        while (last_bk != black_cnt) {
            last_bk = black_cnt;
            for (int i = 0; i < N; i++) {
                if (index[i] == null) {
                    continue;
                } else {
                    solve2(i);
                }
        }
//        System.out.printf("black_cnt= %d \n", black_cnt) ;
        }
    }
    
    static void solve2(int x) { 
        int xy_links = 0;
        while (true) {
            if (xy_links < index[x].out_link_size) {    // xy_links, 途中で追加あり
                /////////////////////////////////////
                //// すべてのxy_linkの先のノードのyについて
                ////   yz_linkの先のzノードで、(z,x)があるか/無ければ追加する
                int y = get_link(index[x], xy_links);  //  y= 1つ先のノード#
                int z;
                for (int yz_links = 0; yz_links < index[y].out_link_size; yz_links++) {
                    z = get_link(index[y], yz_links); //  z= 2つ先のノード#  
//                    System.out.printf("Solve2 x:%d -> y:%d -> z:%d \n", x + 1, y + 1, z + 1);
                    //check_and_set(z, x);      
                    if (has_link(index[z], x)) {
                        continue;
                    } else {
                        //add(x,y) ;
//                        System.out.printf("add_link (%d -> %d)\n", z+1, x+1) ;
                        add_out_link(index[z], x);
                        add_in_link(z, index[x]);
                        black_cnt++;
                        
                        // (z,x)が追加された時、zへの孤(inbound_link = y')を持つノードを処理する
                        //  (y',z)-(z,x) -> (x,y')をcheck & set
                        int ptr = index[z].to_in_link_list ;
                        for (int j=0 ; j< index[z].in_link_size ; j++) {
                            int yy = in_link[0][ptr] ;
                            if (has_link(index[x],yy)) {
                                continue ;
                            } else {
                                add_out_link(index[x], yy);
                                add_in_link(x, index[yy]);
                                black_cnt++;
                            }
                            ptr = in_link[1][ptr] ;
                        }
                    }
                }
                xy_links ++ ;
            } else {
                index[x].visit = 1;
                int ptr = index[x].to_out_link_list ; 
                for (int y = 0; y < index[x].out_link_size; y++) {
                    if (index[out_link[0][ptr]].visit !=0 ) continue ;
                    solve2(out_link[0][ptr]) ;
                    ptr = out_link[1][ptr] ;
                }
                return;
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
            System.out.printf("OUTBOUND:[%d]:", i+1);
            int ptr = index[i].to_out_link_list ;
            for (int j=0 ; j< index[i].out_link_size ; j++) {
                int k = out_link[0][ptr] ;
                System.out.printf("--> %d ", k+1);
                ptr = out_link[1][ptr] ;
            }
            System.out.println();
            System.out.printf("INBOUND :[%d]:", i+1);
            ptr = index[i].to_in_link_list ;
            for (int j=0 ; j< index[i].in_link_size ; j++) {
                int k = in_link[0][ptr] ;
                System.out.printf("--> %d ", k+1);
                ptr = in_link[1][ptr] ;
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
