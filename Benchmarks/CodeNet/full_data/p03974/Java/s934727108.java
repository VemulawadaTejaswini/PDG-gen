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
    static Node[] node ;
    
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
        node = new Node[size]; //max 400000 ;
        for (int i=0 ; i<size ; i++) {
            node[i] = new Node() ;
            node[i].number = i;
        }
        make_tree() ;
        /** /
        tree_dump() ;
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

    static void tree_dump() {
        Node cn;
        for (int i = 0; i < node_p; i++) {
            cn = node[i];
           // while (true) {
                System.out.printf("\n Node=%d, index=%d ",
                        cn.number, cn.index);
                for (int j = 0; j < 26; j++) {
                    if ((cn.index & power_2[j]) != 0) {
                        System.out.printf("\n    : char=%c, cnt=%d next_node=%d : ", 'a' + j, cn.sib_cnt[j], cn.next_node[j]);
                    }
                }
          //  }
        }
    }
        ////////////////////////////////
        /**/
    
    //////////////////////////////////////
    static class Node {
        int number ; // Node番号　[デバッグ用]
        int index ; // このレベルのノードの下に該当する文字があるかのIndex
        int leaf ;  // このレベルの文字がleafを兼ねる場合のbit
        int sib_cnt[] = new int[26] ; // 今のレベルの各文字へのリンク数
        int next_node[] = new int[26] ; // 次のレベルへのリンク, leafの場合　-1
        
        boolean containsKey(char c) {
            if ((power_2[c-'a'] & index)!=0) return true; else return false ;
        }
        void add(char cc) {
            index = index | power_2[cc-'a'] ;
            sib_cnt[cc-'a'] ++ ;
        }
        boolean isLeaf(char c) {
            if ((power_2[c-'a'] & leaf)!=0) return true; else return false ;
        }
    }
    static int node_p  = 0 ; // 次の空ノードへのポインタ

    //////////////////////////////////////
    static int power_2[] = {1,2,4,8,16,32,64,128,256,512,1024,2048,4096,1<<13, 1<<14, 1<<15, 1<<16, 1<<17, 
                     1<<18, 1<<19, 1<<20, 1<<21, 1<<22, 1<<23, 1<<24, 1<<25}; 
    
    static void make_tree() {
        Node node0 = node[0] ; // depth=0
        node_p ++ ;
        for (int i=0 ; i<N; i++) {
            make_tree2(node0, S[i]) ;
        }
    }
    static void make_tree2(Node current_node, char s[]) {
        
        for (int i = 0; i < s.length; i++) {
            char c = s[i];
            Node next_node;
            
            // 今のNodeに1文字の追加
            current_node.add(c) ;  
            // 最終文字
            if (i == s.length-1) { 
                current_node.leaf = current_node.leaf | power_2[c-'a'] ; // leafをセット
                break ;
            }
            // 次のレベルの準備 
            if (current_node.next_node[c-'a'] > 0) {
                next_node = node[current_node.next_node[c-'a']];
            } else {
                // Add Node
                current_node.next_node[c-'a'] = node_p;
                node_p++ ;
                next_node = node[current_node.next_node[c-'a']];
            }
            current_node = next_node ;
        }
    }


    static int Solve(int k, char pattern[]) {
        int cnt = 0 ;
        Node current_node = node[0] ;
        OUTER:
        for (int i = 0; i < S[k].length; i++) {
            for (int j = 0; j < 26; j++) {
                if (current_node.containsKey(pattern[j])) { //　こちらを優先にする(2016.10.23)
                    if (pattern[j] != S[k][i]) {
                        cnt = cnt + current_node.sib_cnt[pattern[j]-'a'];
                    } else {
                        if (current_node.isLeaf(pattern[j])) cnt ++ ; // 途中のleafをカウントする
                        // 2016.10.23追加  (不要なマッチングをカット。効果大だが、若干遅くなるケースもある)
                        if ((current_node.sib_cnt[pattern[j]-'a'] == 1) && (current_node.next_node[pattern[j]-'a'] > 0)) {
                            cnt++;
                            break OUTER;
                        }
                        //
                        current_node = node[current_node.next_node[pattern[j] - 'a']];
                        break;
                    }
                }
            }
        }
        return cnt;
    }
}
