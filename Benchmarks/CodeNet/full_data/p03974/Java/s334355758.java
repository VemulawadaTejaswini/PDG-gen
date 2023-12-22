import java.util.Arrays;
import java.util.Comparator;
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
    static String S[] ; // Σ|S| < 400000文字
    static char S0[][] ;
    static char S1[][] ;
    static String P[] ;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = new String[N] ;
        S0 = new char[N][] ;
        S1 = new char[N][] ;
        for (int i=0 ; i<N ;i++) {
            S[i]=sc.next() ;
            S0[i] = S[i].toCharArray() ;
            S1[i] = new char[S0[i].length] ;
            for (int j=0 ; j<S0[i].length; j++) {
                S0[i][j]=(char)(S0[i][j]-'a') ; 
                //S1[i][j]=S0[i][j] ;                
            }
        }
        Q = sc.nextInt();
        K = new int[Q] ;
        P = new String[Q] ;
        for (int i=0 ; i<Q; i++) {
            K[i] = sc.nextInt() -1 ;
            P[i] = sc.next() ;
        }
        
        for (int i=0 ; i<Q ; i++) {
            System.out.println(Solve(i)) ;
        }

    }
    
    static int Solve(int n) {
        // 変換用テーブルの作成
        char P0[] = P[n].toCharArray();
        for (int j = 0; j < P0.length; j++) {
            P0[j] = (char) (P0[j] - 'a');
        }
        char P1[] = new char[26];
        for (int i= 0 ; i<26; i++) {
            if ((P1[P0[i]]) != i)  P1[P0[i]] = (char) i ;
            else P1[i] = (char) i ;
        }
        /*
        System.out.printf("変換テーブル\n") ;
        for (int i=0 ; i<26; i++) {
            System.out.printf("%c",P1[i]+'a') ;
        }
        System.out.println() ;
        */
        // データを変換する
        for (int i=0 ; i < N ; i++) {
            for (int j= 0 ; j < S0[i].length ;j++) {
                S1[i][j] = P1[(int)S0[i][j]] ;
//                System.out.printf("%c",S1[i][j]+'a') ;
            }
//            System.out.println() ;
        }
        // k番目のデータがソート後に何番目になったか
        char SS[] = S1[K[n]] ;
        int cnt = 1 ;
        for (int i=0 ; i < N ; i++) {
            if (Biggerthan_char(SS, S1[i])) cnt++ ;
        }
        return cnt ;
    }
    
    static boolean Biggerthan_char(char a[], char[] b) {
        int aa = a.length;
        int bb = b.length;
        for (int i = 0; i < min(aa, bb); i++) {
            if (a[i] == b[i]) continue;
            if (a[i] > b[i]) {
                return true;
            } else {
                return false;
            }
        }
        if (aa > bb) {
            return true;
        } else {
            return false;
        }
    }

    static int min(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
}
