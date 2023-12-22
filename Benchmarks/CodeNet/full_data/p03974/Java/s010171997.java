import java.io.PrintWriter;
import java.util.Scanner;

/**
 * http://code-festival-2016-qualb.contest.atcoder.jp/tasks/codefestival_2016_qualB_e
 * 
 * @author Cummin
 */
public class Main {

    static int N ; //  1<= N <= 100000
    static int Q ; //  1<= Q <= 100000
    static int K[] ;
    static char S[][] ; // Σ|S| < 400000文字
    static char P[][] ;
    static Node node_pool[] ;
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = new char[N][] ;
        for (int i=0 ; i<N ;i++) {
            S[i] =sc.next().toCharArray() ;
        }
        Q = sc.nextInt();
        K = new int[Q] ;
        P = new char[Q][] ;
        for (int i=0 ; i<Q; i++) {
            K[i] = sc.nextInt() -1 ;
            P[i] = sc.next().toCharArray() ;
        }
        ///
        int size= 0 ;
        for (int i=0 ; i<N ; i++) {
            size = size + S[i].length +1;
        }
        //size = 100 ;
        node_pool = new Node[size]; //max 400000 ;
        for (int i=0 ; i<size ; i++) {
            node_pool[i] = new Node() ;
            node_pool[i].c = '-' ;
            node_pool[i].number = i;
        }
        make_tree() ;
        /** /
        tree_dump(0) ;
        System.out.println() ;
        /**/
        
        ////// 出力 ////////////////
        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < Q; i++) {
            out.println(Solve(K[i], P[i]));
        }
        out.flush();
        ////////////////////////////
    }
        /**/
    /////////// tree dump /////////////

    static void tree_dump(int i) {
        Node cn;
        cn = node_pool[i];
        while (true) {
            System.out.printf("\n Node=%d, index=%d, char=%c, link_cnt=%d, leaf=%d ",
                    cn.number, cn.index, cn.c, cn.link_cnt, cn.leaf);
            if (cn.next_node != null) System.out.printf(", next_node=%d", cn.next_node.number) ;
            if (cn.sibling_node != null) {
                System.out.printf(" sib_node=%d", cn.sibling_node.number);
                tree_dump(cn.sibling_node.number);
            }
            if (cn.next_node == null) {
                return;
            }
            cn = cn.next_node;
        }
    }
        ////////////////////////////////
        /**/
    
    //////////////////////////////////////
    static class Node {
        char c ;
        int number ;
        int index ; // ノードの下のNodeに該当する文字があるかのIndex
        int link_cnt ;
        Node sibling_node ; // 今のレベルへのリンク
        Node next_node ; // 次のレベルへのリンク
        int leaf ;
        
        boolean containsKey(char c) {
            if ((power_2[c-'a'] & index)!=0) return true; else return false ;
        }
        
        Node get(char cc) {
            if ((power_2[cc-'a'] & index)==0) return null ;
            if (this.c == cc) {
                return this ;
            }
            Node sib_lnk = sibling_node ;
            while(sib_lnk != null) {
                if (sib_lnk.c == cc) return sib_lnk ;
                else sib_lnk = sib_lnk.sibling_node ;
            }
            //System.out.println("ERROR") ;
            return null ; // ここには来ない
        }
        Node add(char cc) {
            if ((power_2[cc-'a'] & index)!=0) return null ;
            index = index | power_2[cc-'a'] ;
            /// insert Node ///
            if (this.c == '-') {
                this.c = cc ;
                return this ;
            }
            Node sib_lnk = node_pool[node_p] ;
            node_p++ ;
            sib_lnk.c = cc ;
            sib_lnk.sibling_node = sibling_node ;
            sibling_node = sib_lnk ;
            return sib_lnk ;
        }
    }
    static int node_p  = 0 ; // 次の空ノードへのポインタ

    //////////////////////////////////////
    static int power_2[] = {1,2,4,8,16,32,64,128,256,512,1024,2048,4096,1<<13, 1<<14, 1<<15, 1<<16, 1<<17, 
                     1<<18, 1<<19, 1<<20, 1<<21, 1<<22, 1<<23, 1<<24, 1<<25}; 
    
    static void make_tree() {
        Node node0 = node_pool[0] ; // depth=0
        node_p ++ ;
        for (int i=0 ; i<N; i++) {
            make_tree2(node0, S[i]) ;
        }
    }
    static void make_tree2(Node current_node, char s[]) {
        
        for (int i = 0; i < s.length; i++) {
            char c = s[i];
            Node next_node;
            Node sib_lnk;
            // 今のレベルで、Nodeに1文字の追加
            if (current_node.containsKey(c)) {
                sib_lnk = current_node.get(c);
                sib_lnk.link_cnt ++ ;
            } else {
                sib_lnk = current_node.add(c) ;
                sib_lnk.link_cnt ++; 
            }
            if (i == s.length-1) { // 最終文字
                sib_lnk.leaf = 1 ;
                break ;
            }
            // 次のレベルの準備 
            if (sib_lnk.next_node != null) {
                next_node = sib_lnk.next_node;
            } else {
                // Add Node
                sib_lnk.next_node = node_pool[node_p];
                node_p++ ;
                next_node = sib_lnk.next_node;
            }
            current_node = next_node ;
        }
    }


    static int Solve(int k, char pattern[]) {
        int cnt = 0 ;
        Node current_node = node_pool[0] ;
        for (int i=0 ; i<S[k].length; i++) {
            for (int j=0 ; j<26; j++) {
                if (pattern[j]!=S[k][i]) {
                    if (current_node.containsKey(pattern[j])) cnt = cnt + current_node.get(pattern[j]).link_cnt ;
                } else {
                    cnt = cnt + current_node.get(pattern[j]).leaf;
                    current_node = current_node.get(pattern[j]).next_node ;
                    break ;
                }
            }
        }
        return cnt ;
    }
}
